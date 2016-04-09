/*
 * Copyright (c) 2015 Alexandros Pappas p_alx hotmail com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 *
 */

package gr.gnostix.freeswitch.model

import java.sql.Timestamp

/**
 * Created by rebel on 13/10/15.
 */
case class CompletedCallStatsByIP(acd: Int, rtpQuality: Double, callerChannelHangupTime: Timestamp, ipAddress: String, hostname: String)
case class CompletedCallStatsByCountryByIP(prefix: Option[String], country: Option[String], billSec: Int, rtpQuality: Double, callerChannelHangupTime: Timestamp, ipAddress: String, hostname: String)
case class CompletedCallStatsByCountryAcdRtpQualityByIP(prefix: String, country: String, acd: Double, rtpQuality: Double, callsNum: Int, ipAddress: String, hostname: String)
case class CompletedCallStatsByCountryAsrByIP(prefix: String, country: String, completedCallsNum: Int, failedCallsNum: Int, asr: Double, ipAddress: String, hostname: String)
case class IpPrefix(ip: String, prefix: String)
