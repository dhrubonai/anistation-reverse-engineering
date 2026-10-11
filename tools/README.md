# Tooling

The following tools were used to produce this repo. They are NOT committed because they exceed GitHub's 100 MB single-file limit (jadx-all.jar is 109 MB). Download them locally if you need to re-run the decompilation.

| Tool | Version | Purpose | Download |
|---|---|---|---|
| jadx | 1.5.0 | DEX → Java decompiler (produces `jadx-sources/`) | https://github.com/skylot/jadx/releases/download/v1.5.0/jadx-1.5.0.zip |
| apktool | 2.10.0 | DEX → smali + resource decoder (produces `apktool-smali/`) | https://github.com/iBotPeaches/Apktool/releases/download/v2.10.0/apktool_2.10.0.jar |
| uber-apk-signer | 1.3.0 | APK signer (will be used to sign the rebuilt APK) | https://github.com/patrickfav/uber-apk-signer/releases/download/v1.3.0/uber-apk-signer-1.3.0.jar |

These tools are kept locally at `/home/z/my-project/analysis/tools/` during the work session.
