package org.underdev.demo.crashingsliceprovider

import android.net.Uri
import androidx.slice.Slice
import androidx.slice.SliceProvider
import androidx.slice.builders.ListBuilder
import androidx.slice.builders.SliceAction

class CrashingSliceProvider : SliceProvider() {
    override fun onBindSlice(sliceUri: Uri?): Slice? =
            when (sliceUri?.path) {
                "/crash" -> makeCrashingSlice(sliceUri)
                else -> null
            }

    override fun onCreateSliceProvider(): Boolean = true

    private fun makeCrashingSlice(uri: Uri): Slice =
            ListBuilder(context, uri, ListBuilder.INFINITY)
                    .setHeader {
                        it.apply {
                            setTitle("Slice title")
                            setSubtitle("Uninstalling me will crash this app.")
                        }
                    }
                    .build()
}