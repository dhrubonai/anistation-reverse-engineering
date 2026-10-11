package com.anistation.model.update;

import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.ds;
import defpackage.hu0;
import defpackage.i13;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mj5;
import defpackage.mz5;
import defpackage.nt1;
import defpackage.q71;
import defpackage.ql3;
import defpackage.qx1;
import defpackage.rb3;
import defpackage.t;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class AppUpdateCheck {
    private final String apkSha256;
    private final Long apkSizeBytes;
    private final String apkUrl;
    private final int currentVersionCode;
    private final boolean forceUpdate;
    private final Integer latestVersionCode;
    private final String latestVersionName;
    private final Integer minSupportedVersionCode;
    private final List<String> releaseNotes;
    private final Long releasedAt;
    private final boolean updateAvailable;
    public static final Companion Companion = new Companion(null);
    private static final rb3[] $childSerializers = {null, null, null, null, null, null, null, null, null, bx7.B(jf3.y, new t(28)), null};

    public /* synthetic */ AppUpdateCheck(int i, boolean z, boolean z2, int i2, String str, Integer num, Integer num2, String str2, String str3, Long l, List list, Long l2, kj5 kj5Var) {
        if ((i & 1) == 0) {
            this.updateAvailable = false;
        } else {
            this.updateAvailable = z;
        }
        if ((i & 2) == 0) {
            this.forceUpdate = false;
        } else {
            this.forceUpdate = z2;
        }
        if ((i & 4) == 0) {
            this.currentVersionCode = 0;
        } else {
            this.currentVersionCode = i2;
        }
        if ((i & 8) == 0) {
            this.latestVersionName = null;
        } else {
            this.latestVersionName = str;
        }
        if ((i & 16) == 0) {
            this.latestVersionCode = null;
        } else {
            this.latestVersionCode = num;
        }
        if ((i & 32) == 0) {
            this.minSupportedVersionCode = null;
        } else {
            this.minSupportedVersionCode = num2;
        }
        if ((i & 64) == 0) {
            this.apkUrl = null;
        } else {
            this.apkUrl = str2;
        }
        if ((i & 128) == 0) {
            this.apkSha256 = null;
        } else {
            this.apkSha256 = str3;
        }
        if ((i & 256) == 0) {
            this.apkSizeBytes = null;
        } else {
            this.apkSizeBytes = l;
        }
        if ((i & 512) == 0) {
            this.releaseNotes = nt1.x;
        } else {
            this.releaseNotes = list;
        }
        if ((i & 1024) == 0) {
            this.releasedAt = null;
        } else {
            this.releasedAt = l2;
        }
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_() {
        return new ds(mz5.a, (byte) 0);
    }

    public static /* synthetic */ x73 a() {
        return _childSerializers$_anonymous_();
    }

    public static /* synthetic */ AppUpdateCheck copy$default(AppUpdateCheck appUpdateCheck, boolean z, boolean z2, int i, String str, Integer num, Integer num2, String str2, String str3, Long l, List list, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = appUpdateCheck.updateAvailable;
        }
        if ((i2 & 2) != 0) {
            z2 = appUpdateCheck.forceUpdate;
        }
        if ((i2 & 4) != 0) {
            i = appUpdateCheck.currentVersionCode;
        }
        if ((i2 & 8) != 0) {
            str = appUpdateCheck.latestVersionName;
        }
        if ((i2 & 16) != 0) {
            num = appUpdateCheck.latestVersionCode;
        }
        if ((i2 & 32) != 0) {
            num2 = appUpdateCheck.minSupportedVersionCode;
        }
        if ((i2 & 64) != 0) {
            str2 = appUpdateCheck.apkUrl;
        }
        if ((i2 & 128) != 0) {
            str3 = appUpdateCheck.apkSha256;
        }
        if ((i2 & 256) != 0) {
            l = appUpdateCheck.apkSizeBytes;
        }
        if ((i2 & 512) != 0) {
            list = appUpdateCheck.releaseNotes;
        }
        if ((i2 & 1024) != 0) {
            l2 = appUpdateCheck.releasedAt;
        }
        List list2 = list;
        Long l3 = l2;
        String str4 = str3;
        Long l4 = l;
        Integer num3 = num2;
        String str5 = str2;
        Integer num4 = num;
        int i3 = i;
        return appUpdateCheck.copy(z, z2, i3, str, num4, num3, str5, str4, l4, list2, l3);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(AppUpdateCheck appUpdateCheck, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 0) || appUpdateCheck.updateAvailable) {
            ((v0) hu0Var).p(aj5Var, 0, appUpdateCheck.updateAvailable);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 1) || appUpdateCheck.forceUpdate) {
            ((v0) hu0Var).p(aj5Var, 1, appUpdateCheck.forceUpdate);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 2) || appUpdateCheck.currentVersionCode != 0) {
            ((v0) hu0Var).t(2, appUpdateCheck.currentVersionCode, aj5Var);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 3) || appUpdateCheck.latestVersionName != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 3, mz5.a, appUpdateCheck.latestVersionName);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 4) || appUpdateCheck.latestVersionCode != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 4, i13.a, appUpdateCheck.latestVersionCode);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 5) || appUpdateCheck.minSupportedVersionCode != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 5, i13.a, appUpdateCheck.minSupportedVersionCode);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 6) || appUpdateCheck.apkUrl != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 6, mz5.a, appUpdateCheck.apkUrl);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 7) || appUpdateCheck.apkSha256 != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 7, mz5.a, appUpdateCheck.apkSha256);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 8) || appUpdateCheck.apkSizeBytes != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 8, ql3.a, appUpdateCheck.apkSizeBytes);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 9) || !a34.i(appUpdateCheck.releaseNotes, nt1.x)) {
            ((v0) hu0Var).v(aj5Var, 9, (mj5) rb3VarArr[9].getValue(), appUpdateCheck.releaseNotes);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 10) || appUpdateCheck.releasedAt != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 10, ql3.a, appUpdateCheck.releasedAt);
        }
    }

    public final boolean component1() {
        return this.updateAvailable;
    }

    public final List<String> component10() {
        return this.releaseNotes;
    }

    public final Long component11() {
        return this.releasedAt;
    }

    public final boolean component2() {
        return this.forceUpdate;
    }

    public final int component3() {
        return this.currentVersionCode;
    }

    public final String component4() {
        return this.latestVersionName;
    }

    public final Integer component5() {
        return this.latestVersionCode;
    }

    public final Integer component6() {
        return this.minSupportedVersionCode;
    }

    public final String component7() {
        return this.apkUrl;
    }

    public final String component8() {
        return this.apkSha256;
    }

    public final Long component9() {
        return this.apkSizeBytes;
    }

    public final AppUpdateCheck copy(boolean z, boolean z2, int i, String str, Integer num, Integer num2, String str2, String str3, Long l, List<String> list, Long l2) {
        list.getClass();
        return new AppUpdateCheck(z, z2, i, str, num, num2, str2, str3, l, list, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppUpdateCheck)) {
            return false;
        }
        AppUpdateCheck appUpdateCheck = (AppUpdateCheck) obj;
        if (this.updateAvailable == appUpdateCheck.updateAvailable && this.forceUpdate == appUpdateCheck.forceUpdate && this.currentVersionCode == appUpdateCheck.currentVersionCode && a34.i(this.latestVersionName, appUpdateCheck.latestVersionName) && a34.i(this.latestVersionCode, appUpdateCheck.latestVersionCode) && a34.i(this.minSupportedVersionCode, appUpdateCheck.minSupportedVersionCode) && a34.i(this.apkUrl, appUpdateCheck.apkUrl) && a34.i(this.apkSha256, appUpdateCheck.apkSha256) && a34.i(this.apkSizeBytes, appUpdateCheck.apkSizeBytes) && a34.i(this.releaseNotes, appUpdateCheck.releaseNotes) && a34.i(this.releasedAt, appUpdateCheck.releasedAt)) {
            return true;
        }
        return false;
    }

    public final String getApkSha256() {
        return this.apkSha256;
    }

    public final Long getApkSizeBytes() {
        return this.apkSizeBytes;
    }

    public final String getApkUrl() {
        return this.apkUrl;
    }

    public final int getCurrentVersionCode() {
        return this.currentVersionCode;
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public final Integer getLatestVersionCode() {
        return this.latestVersionCode;
    }

    public final String getLatestVersionName() {
        return this.latestVersionName;
    }

    public final Integer getMinSupportedVersionCode() {
        return this.minSupportedVersionCode;
    }

    public final List<String> getReleaseNotes() {
        return this.releaseNotes;
    }

    public final Long getReleasedAt() {
        return this.releasedAt;
    }

    public final boolean getUpdateAvailable() {
        return this.updateAvailable;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int c = qx1.c(this.currentVersionCode, zo5.g(Boolean.hashCode(this.updateAvailable) * 31, 31, this.forceUpdate), 31);
        String str = this.latestVersionName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        Integer num = this.latestVersionCode;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num2 = this.minSupportedVersionCode;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.apkUrl;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str3 = this.apkSha256;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Long l = this.apkSizeBytes;
        if (l == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l.hashCode();
        }
        int j = zo5.j(this.releaseNotes, (i6 + hashCode6) * 31, 31);
        Long l2 = this.releasedAt;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return j + i;
    }

    public String toString() {
        boolean z = this.updateAvailable;
        boolean z2 = this.forceUpdate;
        int i = this.currentVersionCode;
        String str = this.latestVersionName;
        Integer num = this.latestVersionCode;
        Integer num2 = this.minSupportedVersionCode;
        String str2 = this.apkUrl;
        String str3 = this.apkSha256;
        Long l = this.apkSizeBytes;
        List<String> list = this.releaseNotes;
        Long l2 = this.releasedAt;
        StringBuilder sb = new StringBuilder("AppUpdateCheck(updateAvailable=");
        sb.append(z);
        sb.append(", forceUpdate=");
        sb.append(z2);
        sb.append(", currentVersionCode=");
        sb.append(i);
        sb.append(", latestVersionName=");
        sb.append(str);
        sb.append(", latestVersionCode=");
        sb.append(num);
        sb.append(", minSupportedVersionCode=");
        sb.append(num2);
        sb.append(", apkUrl=");
        qx1.x(sb, str2, ", apkSha256=", str3, ", apkSizeBytes=");
        sb.append(l);
        sb.append(", releaseNotes=");
        sb.append(list);
        sb.append(", releasedAt=");
        sb.append(l2);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return AppUpdateCheck$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AppUpdateCheck() {
        this(false, false, 0, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (Long) null, (List) null, (Long) null, 2047, (q71) null);
    }

    public AppUpdateCheck(boolean z, boolean z2, int i, String str, Integer num, Integer num2, String str2, String str3, Long l, List<String> list, Long l2) {
        list.getClass();
        this.updateAvailable = z;
        this.forceUpdate = z2;
        this.currentVersionCode = i;
        this.latestVersionName = str;
        this.latestVersionCode = num;
        this.minSupportedVersionCode = num2;
        this.apkUrl = str2;
        this.apkSha256 = str3;
        this.apkSizeBytes = l;
        this.releaseNotes = list;
        this.releasedAt = l2;
    }

    public /* synthetic */ AppUpdateCheck(boolean z, boolean z2, int i, String str, Integer num, Integer num2, String str2, String str3, Long l, List list, Long l2, int i2, q71 q71Var) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : l, (i2 & 512) != 0 ? nt1.x : list, (i2 & 1024) != 0 ? null : l2);
    }
}
