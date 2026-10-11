package com.anistation.model.report;

import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.gr;
import defpackage.h11;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.m03;
import defpackage.mj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.qx1;
import defpackage.rb3;
import defpackage.s03;
import defpackage.uv1;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class BugReport {
    private final String appVersion;
    private final String bugId;
    private final String description;
    private final String deviceName;
    private final String osVersion;
    private final m03 reportedAt;
    private final BugStatus status;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final rb3[] $childSerializers = {null, null, null, null, null, null, bx7.B(jf3.y, new gr((byte) 9)), null};

    public /* synthetic */ BugReport(int i, String str, String str2, String str3, String str4, String str5, String str6, BugStatus bugStatus, m03 m03Var, kj5 kj5Var) {
        if (190 != (i & 190)) {
            iq4.throwMissingFieldException(i, 190, BugReport$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.bugId = null;
        } else {
            this.bugId = str;
        }
        this.title = str2;
        this.description = str3;
        this.deviceName = str4;
        this.osVersion = str5;
        this.appVersion = str6;
        if ((i & 64) == 0) {
            this.status = null;
        } else {
            this.status = bugStatus;
        }
        this.reportedAt = m03Var;
    }

    public static final x73 _childSerializers$_anonymous_() {
        BugStatus[] values = BugStatus.values();
        values.getClass();
        return new uv1("com.anistation.model.report.BugStatus", values);
    }

    public static /* synthetic */ BugReport copy$default(BugReport bugReport, String str, String str2, String str3, String str4, String str5, String str6, BugStatus bugStatus, m03 m03Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bugReport.bugId;
        }
        if ((i & 2) != 0) {
            str2 = bugReport.title;
        }
        if ((i & 4) != 0) {
            str3 = bugReport.description;
        }
        if ((i & 8) != 0) {
            str4 = bugReport.deviceName;
        }
        if ((i & 16) != 0) {
            str5 = bugReport.osVersion;
        }
        if ((i & 32) != 0) {
            str6 = bugReport.appVersion;
        }
        if ((i & 64) != 0) {
            bugStatus = bugReport.status;
        }
        if ((i & 128) != 0) {
            m03Var = bugReport.reportedAt;
        }
        BugStatus bugStatus2 = bugStatus;
        m03 m03Var2 = m03Var;
        String str7 = str5;
        String str8 = str6;
        return bugReport.copy(str, str2, str3, str4, str7, str8, bugStatus2, m03Var2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(BugReport bugReport, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 0) || bugReport.bugId != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 0, mz5.a, bugReport.bugId);
        }
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 1, bugReport.title);
        v0Var.w(aj5Var, 2, bugReport.description);
        v0Var.w(aj5Var, 3, bugReport.deviceName);
        v0Var.w(aj5Var, 4, bugReport.osVersion);
        v0Var.w(aj5Var, 5, bugReport.appVersion);
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 6) || bugReport.status != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 6, (mj5) rb3VarArr[6].getValue(), bugReport.status);
        }
        v0Var.v(aj5Var, 7, s03.a, bugReport.reportedAt);
    }

    public final String component1() {
        return this.bugId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.deviceName;
    }

    public final String component5() {
        return this.osVersion;
    }

    public final String component6() {
        return this.appVersion;
    }

    public final BugStatus component7() {
        return this.status;
    }

    public final m03 component8() {
        return this.reportedAt;
    }

    public final BugReport copy(String str, String str2, String str3, String str4, String str5, String str6, BugStatus bugStatus, m03 m03Var) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        m03Var.getClass();
        return new BugReport(str, str2, str3, str4, str5, str6, bugStatus, m03Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugReport)) {
            return false;
        }
        BugReport bugReport = (BugReport) obj;
        if (a34.i(this.bugId, bugReport.bugId) && a34.i(this.title, bugReport.title) && a34.i(this.description, bugReport.description) && a34.i(this.deviceName, bugReport.deviceName) && a34.i(this.osVersion, bugReport.osVersion) && a34.i(this.appVersion, bugReport.appVersion) && this.status == bugReport.status && a34.i(this.reportedAt, bugReport.reportedAt)) {
            return true;
        }
        return false;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getBugId() {
        return this.bugId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final m03 getReportedAt() {
        return this.reportedAt;
    }

    public final BugStatus getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        String str = this.bugId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = zo5.i(this.appVersion, zo5.i(this.osVersion, zo5.i(this.deviceName, zo5.i(this.description, zo5.i(this.title, hashCode * 31, 31), 31), 31), 31), 31);
        BugStatus bugStatus = this.status;
        if (bugStatus != null) {
            i = bugStatus.hashCode();
        }
        return this.reportedAt.hashCode() + ((i2 + i) * 31);
    }

    public String toString() {
        String str = this.bugId;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.deviceName;
        String str5 = this.osVersion;
        String str6 = this.appVersion;
        BugStatus bugStatus = this.status;
        m03 m03Var = this.reportedAt;
        StringBuilder o = h11.o("BugReport(bugId=", str, ", title=", str2, ", description=");
        qx1.x(o, str3, ", deviceName=", str4, ", osVersion=");
        qx1.x(o, str5, ", appVersion=", str6, ", status=");
        o.append(bugStatus);
        o.append(", reportedAt=");
        o.append(m03Var);
        o.append(")");
        return o.toString();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return BugReport$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BugReport(String str, String str2, String str3, String str4, String str5, String str6, BugStatus bugStatus, m03 m03Var) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        m03Var.getClass();
        this.bugId = str;
        this.title = str2;
        this.description = str3;
        this.deviceName = str4;
        this.osVersion = str5;
        this.appVersion = str6;
        this.status = bugStatus;
        this.reportedAt = m03Var;
    }

    public /* synthetic */ BugReport(String str, String str2, String str3, String str4, String str5, String str6, BugStatus bugStatus, m03 m03Var, int i, q71 q71Var) {
        this((i & 1) != 0 ? null : str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : bugStatus, m03Var);
    }
}
