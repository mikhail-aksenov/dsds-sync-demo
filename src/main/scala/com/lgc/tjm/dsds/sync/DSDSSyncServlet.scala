package com.lgc.tjm.dsds.sync

import org.scalatra._
import scalate.ScalateSupport

class DSDSSyncServlet extends DsdsSyncDemoStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
