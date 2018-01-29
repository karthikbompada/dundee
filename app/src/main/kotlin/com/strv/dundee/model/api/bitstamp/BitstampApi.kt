package com.strv.dundee.model.api.bitstamp

import com.strv.dundee.model.api.BitcoinApi
import com.strv.dundee.model.api.CandlesProvider
import com.strv.dundee.model.api.TickerProvider
import com.strv.ktools.getRetrofitInterface
import retrofit2.Call

class BitstampApi : BitcoinApi {
	val URL = "https://www.bitstamp.net/api/v2/"

	val api = getRetrofitInterface(URL, BitstampApiInterface::class.java)

	override fun getTicker(coin: String, currency: String): Call<out TickerProvider> {
		return api.getTicker("${coin.toLowerCase()}${currency.toLowerCase()}")
	}

	override fun getCandles(coin: String, currency: String, timeFrame: String): Call<out CandlesProvider> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}
}