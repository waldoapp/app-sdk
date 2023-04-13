// swift-tools-version:5.2

import PackageDescription

let package = Package(
    name: "WaldoAppSdk",
    platforms: [
        .iOS(.v10),
    ],
    products: [
        .library(
            name: "WaldoAppSdk",
            targets: ["WaldoAppSdk"]),
    ],
    dependencies: [
    ],
    targets: [
        .target(
            name: "WaldoAppSdk",
            dependencies: []),
        .testTarget(
            name: "WaldoAppSdkTests",
            dependencies: ["WaldoAppSdk"]),
    ]
)
