""
load("//build:rust-musl.bzl", "rust_musl")

licenses(["notice"])

rust_musl(
    name = "hamming",
    srcs = glob(["src/*.rs"]),
    rustc_flags = [
        "-C",
        "target-cpu=haswell",
    ],
    visibility = ["//visibility:public"],
)