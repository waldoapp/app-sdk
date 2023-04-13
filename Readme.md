# Android

## Publishing a release

Create a tag named `android/vX.Y.Z` and push it to the repository. Then create a release on the tag. The CI will publish the maven package to the GitHub package registry.

```bash
git tag android/vX.Y.Z
git push origin android/vX.Y.Z
gh release create android/vX.Y.Z
```