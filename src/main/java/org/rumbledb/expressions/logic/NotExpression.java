/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Authors: Stefan Irimescu, Can Berker Cikis
 *
 */

package org.rumbledb.expressions.logic;

import java.util.Collections;
import java.util.List;

import org.rumbledb.exceptions.ExceptionMetadata;
import org.rumbledb.expressions.AbstractNodeVisitor;
import org.rumbledb.expressions.Expression;
import org.rumbledb.expressions.Node;


public class NotExpression extends Expression {

    private Expression mainExpression;

    public NotExpression(Expression mainExpression, ExceptionMetadata metadata) {
        super(metadata);
    }

    @Override
    public <T> T accept(AbstractNodeVisitor<T> visitor, T argument) {
        return visitor.visitNotExpr(this, argument);
    }

    @Override
    public String serializationString(boolean prefix) {
        String result = "(notExpr ";
        result += "not ";
        result += this.mainExpression.serializationString(true);
        result += ")";
        return result;
    }

    public Expression getMainExpression() {
        return this.mainExpression;
    }

    @Override
    public List<Node> getChildren() {
        return Collections.singletonList(this.mainExpression);
    }

}
