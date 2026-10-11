package com.anistation.model.report;

import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.jb0;
import defpackage.kj5;
import defpackage.kq4;
import defpackage.l61;
import defpackage.m03;
import defpackage.mz5;
import defpackage.ne1;
import defpackage.qi2;
import defpackage.rb3;
import defpackage.s03;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class BugReport$$serializer implements wd2 {
    public static final BugReport$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        BugReport$$serializer bugReport$$serializer = new BugReport$$serializer();
        INSTANCE = bugReport$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.report.BugReport", bugReport$$serializer, 8);
        kq4Var.j("bugId", true);
        kq4Var.j("title", false);
        kq4Var.j("description", false);
        kq4Var.j("deviceName", false);
        kq4Var.j("osVersion", false);
        kq4Var.j("appVersion", false);
        kq4Var.j("status", true);
        kq4Var.j("reportedAt", false);
        descriptor = kq4Var;
    }

    private BugReport$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = BugReport.$childSerializers;
        mz5 mz5Var = mz5.a;
        return new x73[]{jb0.a(mz5Var), mz5Var, mz5Var, mz5Var, mz5Var, mz5Var, jb0.a((x73) rb3VarArr[6].getValue()), s03.a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x007e. Please report as an issue. */
    @Override // defpackage.ne1
    public final BugReport deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        BugStatus bugStatus;
        int i;
        String str;
        m03 m03Var;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = BugReport.$childSerializers;
        int i2 = 7;
        boolean z = false;
        if (c.decodeSequentially()) {
            String str7 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5.a, null);
            String m = c.m(aj5Var, 1);
            String m2 = c.m(aj5Var, 2);
            String m3 = c.m(aj5Var, 3);
            String m4 = c.m(aj5Var, 4);
            String m5 = c.m(aj5Var, 5);
            bugStatus = (BugStatus) c.decodeNullableSerializableElement(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), null);
            str = str7;
            m03Var = (m03) c.p(aj5Var, 7, s03.a, null);
            str2 = m5;
            str3 = m3;
            str4 = m4;
            str5 = m2;
            i = 255;
            str6 = m;
        } else {
            boolean z2 = true;
            BugStatus bugStatus2 = null;
            String str8 = null;
            m03 m03Var2 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            int i3 = 0;
            while (z2) {
                int i4 = c.i(aj5Var);
                switch (i4) {
                    case -1:
                        z2 = z;
                        i2 = 7;
                    case 0:
                        str8 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5.a, str8);
                        i3 |= 1;
                        z = false;
                        i2 = 7;
                    case 1:
                        str13 = c.m(aj5Var, 1);
                        i3 |= 2;
                        z = false;
                    case 2:
                        str12 = c.m(aj5Var, 2);
                        i3 |= 4;
                        z = false;
                    case 3:
                        str10 = c.m(aj5Var, 3);
                        i3 |= 8;
                        z = false;
                    case 4:
                        str11 = c.m(aj5Var, 4);
                        i3 |= 16;
                        z = false;
                    case 5:
                        str9 = c.m(aj5Var, 5);
                        i3 |= 32;
                        z = false;
                    case 6:
                        bugStatus2 = (BugStatus) c.decodeNullableSerializableElement(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), bugStatus2);
                        i3 |= 64;
                        z = false;
                    case 7:
                        m03Var2 = (m03) c.p(aj5Var, i2, s03.a, m03Var2);
                        i3 |= 128;
                        z = false;
                    default:
                        qi2.f(i4);
                        return null;
                }
            }
            bugStatus = bugStatus2;
            i = i3;
            str = str8;
            m03Var = m03Var2;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            str5 = str12;
            str6 = str13;
        }
        c.a(aj5Var);
        return new BugReport(i, str, str6, str5, str3, str4, str2, bugStatus, m03Var, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, BugReport bugReport) {
        wt1Var.getClass();
        bugReport.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        BugReport.write$Self$AniStation_core_model(bugReport, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
