load("@bazel_skylib//rules:build_test.bzl", "build_test")
load("//apple:ios.bzl", "ios_application")
load("@build_bazel_rules_swift//swift:swift.bzl", "swift_library")

licenses(["notice"])

swift_library(
    name = "Sources",
    srcs = [
        "Rusty/*.swift",
    ],
)

ios_application(
    name = "RustyApple",
    app_icons = ["//Rusty/Assets.xcassets:AppIcon.appiconset"],
    bundle_id = "com.darraghdowney.rusty",
    families = [
        "iphone",
        "ipad",
    ],
    infoplists = [":Info.plist"],
    launch_storyboard = "//Rusty/resources:Launch.storyboard",
    minimum_os_version = "8.0",
    deps = [":Sources"],
)

# Not normally needed, just done for rules_apple's examples so a
# 'bazel test examples/...' ensures all Examples still build.
build_test(
    name = "RustyAppleTest",
    targets = [":RustyApple"],
)