(:JIQS: ShouldRun; Output="(2006-08-12T13:20:00Z, 2008-03-12T18:21:10+02:00, 2014-06-27T04:06:05.512Z, 2004-08-15T04:56:22.500-14:00, P458DT2H9M47S, 2003-02-23T19:11:06.488-05:00, 1764-11-12T13:20:00-05:00, 2004-02-12-10:00, 2003-01-17-10:00, 3015-02-12Z, -2008-04-29Z, 1999-10-12-10:00, 2000-11-05-10:00, P-1095697DT-14H)" :)
dateTime("2004-04-12T13:20:00") + yearMonthDuration("P2Y4M"),
yearMonthDuration("P3Y1M") + dateTime("2005-02-12T18:21:10+02:00"),
dateTime("2014-06-22T24:00:00") + dayTimeDuration("P4DT4H6M5.512S"),
dayTimeDuration("P124DT9H96M22.5S") + dateTime("2004-04-12T18:20:00-14:00"),
dateTime(()) + dayTimeDuration("P4DT4H6M5.512S"),
yearMonthDuration(()) + dateTime("2004-04-12T13:20:00"),
dateTime("2004-04-12T13:20:00") - dateTime("2003-01-11T01:10:13+14:00"),
dateTime("2004-04-12T13:20:00-05:00") - dayTimeDuration("P412DT41H68M53.512S"),
dateTime("2004-04-12T13:20:00-05:00") - yearMonthDuration("P233Y77M"),
date("2001-12-12-10:00") + yearMonthDuration("P2Y2M"),
date("2001-12-12-10:00") + dayTimeDuration("P399DT55H2M5.55S"),
yearMonthDuration("P3Y1M") + date("3012-01-12"),
dayTimeDuration("P1233DT44H21M12.44S") + date("-2012-12-12"),
date("2001-12-12-10:00") - yearMonthDuration("P2Y2M"),
date("2001-12-12-10:00") - dayTimeDuration("P399DT55H2M5.55S"),
date("-2001-12-12-10:00") - date("0999-11-12Z")

(: general tests :)
