package com.finmid.kata

import org.http4k.client.OkHttp
import org.http4k.core.Method
import org.http4k.core.Request
import org.junit.jupiter.api.extension.AfterAllCallback
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.TestWatcher
import java.time.Instant

class ExecutionListener : AfterAllCallback, TestWatcher {

    private var failed = 0
    private var succeeded = 0
    private var lastTest = "none"

    override fun afterAll(context: ExtensionContext?) {
        val client = OkHttp()
        client(Request(Method.POST, reportUrl).body(
            "${Instant.now()},$teamName,$failed,$succeeded,$lastTest"
        ))
    }

    override fun testFailed(context: ExtensionContext, cause: Throwable?) {
        failed++
        lastTest = context.displayName
    }

    override fun testSuccessful(context: ExtensionContext) {
        succeeded++
        lastTest = context.displayName
    }

}
