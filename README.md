# Woolworths Village Android SDK

## Usage

This will produce the AAR

```bash
$ ./gradlew assembleDebug
```

## Versioning

TODO: Work out final versioning scheme
TODO: How to get the schema?

The SDK is designed to work against a version of the Village API.
The version of the API can be found in `BuildConfig.VILLAGE_API_VERSION` This
build property can help Application developers know which version of the
API this SDK will support.