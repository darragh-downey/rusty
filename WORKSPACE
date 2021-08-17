load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "build_bazel_rules_apple",
    sha256 = "0052d452af7742c8f3a4e0929763388a66403de363775db7e90adecb2ba4944b",
    url = "https://github.com/bazelbuild/rules_apple/releases/download/0.31.3/rules_apple.0.31.3.tar.gz",
)

load(
    "@build_bazel_rules_apple//apple:repositories.bzl",
    "apple_rules_dependencies",
)

apple_rules_dependencies()

load(
    "@build_bazel_rules_swift//swift:repositories.bzl",
    "swift_rules_dependencies",
)

swift_rules_dependencies()

load(
    "@build_bazel_rules_swift//swift:extras.bzl",
    "swift_rules_extra_dependencies",
)

swift_rules_extra_dependencies()

load(
    "@build_bazel_apple_support//lib:repositories.bzl",
    "apple_support_dependencies",
)

apple_support_dependencies()

####

http_archive(
    name = "io_bazel_rules_appengine",
    strip_prefix = "rules_appengine-8099725bab2fa01ccd385fac2f78278ea8145a7a",
    # TODO: update to a release version that contains 339f6aba67fcedb7268cf54d1163cf7704a277ca.
    # This commit fixes the Maven artifact URLs to use "https" instead of "http".
    # We don't specify sha256, because the sha256 of GitHub-served non-release archives isn't
    # stable.
    urls = ["https://github.com/bazelbuild/rules_appengine/archive/8099725bab2fa01ccd385fac2f78278ea8145a7a.tar.gz"],
)

load(
    "@io_bazel_rules_appengine//appengine:java_appengine.bzl",
    "java_appengine_repositories",
)

java_appengine_repositories()

android_sdk_repository(
    name = "androidsdk", # Required. Name *must* be "androidsdk".
    # path = "/path/to/sdk", # Optional. Can be omitted if `ANDROID_HOME` environment variable is set.
)

android_ndk_repository(
    name = "androidndk", # Required. Name *must* be "androidndk".
    path = "$ANDROID_HOME/ndk/23.0.7599858", # Optional. Can be omitted if `ANDROID_NDK_HOME` environment variable is set.
)


http_archive(
    name = "rules_android",
    sha256 = "cd06d15dd8bb59926e4d65f9003bfc20f9da4b2519985c27e190cddc8b7a7806",
    strip_prefix = "rules_android-0.1.1",
    urls = ["https://github.com/bazelbuild/rules_android/archive/v0.1.1.zip"],
)

http_archive(
    name = "rules_rust",
    sha256 = "224ebaf1156b6f2d3680e5b8c25191e71483214957dfecd25d0f29b2f283283b",
    strip_prefix = "rules_rust-a814d859845c420fd105c629134c4a4cb47ba3f8",
    urls = [
        # `main` branch as of 2021-06-15
        "https://github.com/bazelbuild/rules_rust/archive/a814d859845c420fd105c629134c4a4cb47ba3f8.tar.gz",
    ],
)

load("@rules_rust//rust:repositories.bzl", "rust_repositories")

rust_repositories(rustfmt_version = "1.53.0")
