package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class t00 implements wd2 {
    public static final t00 a;
    private static final aj5 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd2, t00, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        kq4 kq4Var = new kq4("com.anistation.repository.backup.BackupPayload", obj, 7);
        kq4Var.j("createdAtEpochMillis", false);
        kq4Var.j("appVersionName", false);
        kq4Var.j("animeList", false);
        kq4Var.j("watchProgress", false);
        kq4Var.j("removedWatchHistoryIds", false);
        kq4Var.j("settings", false);
        kq4Var.j("removedWatchHistoryAnimeIds", true);
        descriptor = kq4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr = v00.h;
        return new x73[]{ql3.a, mz5.a, rb3VarArr[2].getValue(), rb3VarArr[3].getValue(), rb3VarArr[4].getValue(), t10.a, rb3VarArr[6].getValue()};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0089. Please report as an issue. */
    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        List list;
        List list2;
        List list3;
        String str;
        v10 v10Var;
        int i;
        List list4;
        long j;
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3[] rb3VarArr = v00.h;
        int i2 = 5;
        int i3 = 1;
        List list5 = null;
        if (c.decodeSequentially()) {
            long B = c.B(aj5Var, 0);
            String m = c.m(aj5Var, 1);
            List list6 = (List) c.p(aj5Var, 2, (ne1) rb3VarArr[2].getValue(), null);
            List list7 = (List) c.p(aj5Var, 3, (ne1) rb3VarArr[3].getValue(), null);
            List list8 = (List) c.p(aj5Var, 4, (ne1) rb3VarArr[4].getValue(), null);
            v10 v10Var2 = (v10) c.p(aj5Var, 5, t10.a, null);
            list = (List) c.p(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), null);
            str = m;
            v10Var = v10Var2;
            i = 127;
            list4 = list7;
            list3 = list8;
            list2 = list6;
            j = B;
        } else {
            boolean z = true;
            int i4 = 0;
            List list9 = null;
            List list10 = null;
            List list11 = null;
            long j2 = 0;
            String str2 = null;
            v10 v10Var3 = null;
            while (z) {
                int i5 = c.i(aj5Var);
                switch (i5) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        j2 = c.B(aj5Var, 0);
                        i4 |= 1;
                        i2 = 5;
                    case 1:
                        str2 = c.m(aj5Var, i3);
                        i4 |= 2;
                    case 2:
                        list10 = (List) c.p(aj5Var, 2, (ne1) rb3VarArr[2].getValue(), list10);
                        i4 |= 4;
                        i3 = 1;
                    case 3:
                        list11 = (List) c.p(aj5Var, 3, (ne1) rb3VarArr[3].getValue(), list11);
                        i4 |= 8;
                        i3 = 1;
                    case 4:
                        list5 = (List) c.p(aj5Var, 4, (ne1) rb3VarArr[4].getValue(), list5);
                        i4 |= 16;
                        i3 = 1;
                    case 5:
                        v10Var3 = (v10) c.p(aj5Var, i2, t10.a, v10Var3);
                        i4 |= 32;
                        i3 = 1;
                    case 6:
                        list9 = (List) c.p(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), list9);
                        i4 |= 64;
                        i3 = 1;
                    default:
                        qi2.f(i5);
                        return null;
                }
            }
            list = list9;
            list2 = list10;
            list3 = list5;
            str = str2;
            v10Var = v10Var3;
            i = i4;
            list4 = list11;
            j = j2;
        }
        c.a(aj5Var);
        return new v00(i, j, str, list2, list4, list3, v10Var, list);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        v00 v00Var = (v00) obj;
        v00Var.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        rb3[] rb3VarArr = v00.h;
        v0 v0Var = (v0) c;
        v0Var.u(aj5Var, 0, v00Var.a);
        v0Var.w(aj5Var, 1, v00Var.b);
        v0Var.v(aj5Var, 2, (mj5) rb3VarArr[2].getValue(), v00Var.c);
        v0Var.v(aj5Var, 3, (mj5) rb3VarArr[3].getValue(), v00Var.d);
        v0Var.v(aj5Var, 4, (mj5) rb3VarArr[4].getValue(), v00Var.e);
        v0Var.v(aj5Var, 5, t10.a, v00Var.f);
        List list = v00Var.g;
        if (!a34.i(list, nt1.x)) {
            v0Var.v(aj5Var, 6, (mj5) rb3VarArr[6].getValue(), list);
        }
        c.a(aj5Var);
    }
}
