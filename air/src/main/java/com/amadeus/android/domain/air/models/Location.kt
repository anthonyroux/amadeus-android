/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Airport & City Search
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property id id of the ressource
 * @property self
 * @property type the resource name
 * @property subType location sub type
 * @property name short name of the location
 * @property detailedName detailed name of the location. For a city location it contains city name and country code. For an airport location it contains city name; country code and airport full name
 * @property timeZoneOffset timezone offset of the location at the date of the API call (including daylight saving time)
 * @property iataCode IATA code of the location. ([IATA table codes](http://www.iata.org/publications/Pages/code-search.aspx) here)
 * @property geoCode
 * @property address
 * @property distance
 * @property analytics
 * @property relevance score value calculated based on distance and analytics
 */
@JsonClass(generateAdapter = true)
data class Location(
    @Json(name = "id") @field:Json(name = "id") var id: String? = null,
    @Json(name = "self") @field:Json(name = "self") var self: Links? = null,
    @Json(name = "type") @field:Json(name = "type") var type: String? = null,
    @Json(name = "subType") @field:Json(name = "subType") var subType: Location.SubTypeEnum? = null,
    @Json(name = "name") @field:Json(name = "name") var name: String? = null,
    @Json(name = "detailedName") @field:Json(name = "detailedName") var detailedName: String? = null,
    @Json(name = "timeZoneOffset") @field:Json(name = "timeZoneOffset") var timeZoneOffset: String? = null,
    @Json(name = "iataCode") @field:Json(name = "iataCode") var iataCode: String? = null,
    @Json(name = "geoCode") @field:Json(name = "geoCode") var geoCode: GeoCode? = null,
    @Json(name = "address") @field:Json(name = "address") var address: Address? = null,
    @Json(name = "distance") @field:Json(name = "distance") var distance: Distance? = null,
    @Json(name = "analytics") @field:Json(name = "analytics") var analytics: Analytics? = null,
    @Json(name = "relevance") @field:Json(name = "relevance") var relevance: Double? = null
) {
    /**
     * location sub type
     * Values: AIRPORT, CITY
     */
    @JsonClass(generateAdapter = false)
    enum class SubTypeEnum(val value: String) {
        @Json(name = "AIRPORT")
        AIRPORT("AIRPORT"),
        @Json(name = "CITY")
        CITY("CITY")
    }
}