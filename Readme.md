# iOS

## Usage

1. Open the packages view in XCode <br />
  ![XCode File Menu](./ios/docs/install_1_file_menu.png)
2. Add the package using the url `https://github.com/waldoapp/app-sdk` <br />
  ![XCode Add Package](./ios/docs/install_2_add_package_url.png)
3. Choose the single product `WaldoAppSdk` <br />
  ![XCode Choose Product](./ios/docs/install_3_choose_product.png)

## Publishing a release

Create a tag named `ios/vX.Y.Z` and push it to the repository. Then create a release on the tag.

```bash
export IOS_VERSION=X.Y.Z
git tag ios/v$IOS_VERSION
git push origin ios/v$IOS_VERSION
gh release create ios/v$IOS_VERSION
```

# Android

## Usage

TODO

## Publishing a release

Create a tag named `android/vX.Y.Z` and push it to the repository. Then create a release on the tag. The CI will publish the maven package to the GitHub package registry.

```bash
export ANDROID_VERSION=X.Y.Z
git tag android/v$ANDROID_VERSION
git push origin android/v$ANDROID_VERSION
gh release create android/v$ANDROID_VERSION
```