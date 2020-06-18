# Android Game Template

## Compatibility

This application targets Android (4.4) KitKat and newer.

## Project Modules

This particular Android project consists of the following modules:

1. **application** - produces Android Game Template executable application.

## Project Flavors

Build is configured to produce two different flavors:

  - `dev` - flavor with enabled all development tools,
  - `prod` - flavor with disabled all development tools.

## Documentation and configuration

Do not hesitate to consult `settings` directory. You can find there such directories as:

  - `keystore` - with signing configuration details,
  - `proguard` - with ProGuard definitions,
  - `services` - with readme that contains description of any external services integration.

## Building production

Before building production ensure to:

  - change build flavor to `prod`.

This flavor uses production configuration files. These files introduces crucial changes:

  - defines proper server connection details (uris, etc.),
  - enables/disables development tools such as Stetho, etc.,
  - configures network requests log level.

## Gradle properties

There are available options that can be configured in `utility\gradle.properties` file.

Common options:

  - `EnableDebugBridge` - allows to enable/disable debug bridge (eg. Stetho).

Product flavor server-related options:

  - `<flavor>ServerUrl` - allows to configure server uri.

> Note that you can find `gradle.properties.sample` file in application modules. If you would like to use default values, just copy this file and paste as `gradle.properties`.

After preparing `gradle.properties` file you have to synchronize your Gradle build. This allows to generate `BuildConfig` class with required constant variables.
