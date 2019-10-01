package sttp.client

import sttp.client.testing.{ConvertToFuture, HttpTest}

class HttpURLConnectionBackendHttpTest extends HttpTest[Identity] {

  override implicit val backend: SttpBackend[Identity, Nothing] = HttpURLConnectionBackend()
  override implicit val convertToFuture: ConvertToFuture[Identity] = ConvertToFuture.id
}