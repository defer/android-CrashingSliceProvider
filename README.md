# CrashingSliceProvider

This is a demo for https://issuetracker.google.com/issues/79784008

To reproduce the issue, just install this app, install the slice-viewer available at https://github.com/googlesamples/android-SliceViewer/releases/tag/1.0.0-alpha1.1

On the slice viewer, add content://org.underdev.demo.crashingsliceprovider/crash, give it the permissions and you should be able to see the slice.

Now, with the slice viewer open, run adb shell pm uninstall org.underdev.demo.crashingsliceprovider and you will see the slice viewer crash.
