package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.window.BackEvent;
import com.anistation.model.MediaStatus;
import com.anistation.model.library.AnimeListItem;
import com.anistation.model.library.AnimeWithProgress;
import com.anistation.model.schedule.AnimeSchedule;
import io.ktor.client.engine.cio.CIOEngineContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class wk6 {
    public static final os0 a = new os0(-282679751, false, new vs0(29));
    public static final os0 b = new os0(-1729468517, false, new qs0(0));
    public static final y23 c = new y23(new wj3(28), new rs4(12), 14);
    public static final String[] d = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] e = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    public static Integer A(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1118317585:
                    if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                        return 3;
                    }
                    return null;
                case -962896020:
                    if (str.equals("REPEAT_SINGLE")) {
                        return 2;
                    }
                    return null;
                case 1645938909:
                    if (str.equals("REPEAT_ALL")) {
                        return 1;
                    }
                    return null;
                case 1645952171:
                    if (str.equals("REPEAT_OFF")) {
                        return 0;
                    }
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }

    public static final yz3 B(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new de4(ub2Var));
    }

    public static long C(int i, String str) {
        int m = m(0, i, str, false);
        Matcher matcher = j01.m.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (m < i) {
            int m2 = m(m + 1, i, str, true);
            matcher.region(m, m2);
            if (i3 == -1 && matcher.usePattern(j01.m).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i3 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i6 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i7 = Integer.parseInt(group3);
            } else if (i4 == -1 && matcher.usePattern(j01.l).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i4 = Integer.parseInt(group4);
            } else {
                if (i5 == -1) {
                    Pattern pattern = j01.k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i5 = uz5.T(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(j01.j).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i2 = Integer.parseInt(group6);
                }
            }
            m = m(m2 + 1, i, str, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 >= 1601) {
            if (i5 != -1) {
                if (1 <= i4 && i4 < 32) {
                    if (i3 >= 0 && i3 < 24) {
                        if (i6 >= 0 && i6 < 60) {
                            if (i7 >= 0 && i7 < 60) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(dq6.e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i2);
                                gregorianCalendar.set(2, i5 - 1);
                                gregorianCalendar.set(5, i4);
                                gregorianCalendar.set(11, i3);
                                gregorianCalendar.set(12, i6);
                                gregorianCalendar.set(13, i7);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            ze0.k("Failed requirement.");
                            return 0L;
                        }
                        ze0.k("Failed requirement.");
                        return 0L;
                    }
                    ze0.k("Failed requirement.");
                    return 0L;
                }
                ze0.k("Failed requirement.");
                return 0L;
            }
            ze0.k("Failed requirement.");
            return 0L;
        }
        ze0.k("Failed requirement.");
        return 0L;
    }

    public static final g13 D(n05 n05Var) {
        return new g13(Math.round(n05Var.a), Math.round(n05Var.b), Math.round(n05Var.c), Math.round(n05Var.d));
    }

    public static final void E(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static yz3 F(yz3 yz3Var, float f, om5 om5Var) {
        boolean z;
        if (vm1.b(f, 0.0f) > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        long j = gi2.a;
        if (vm1.b(f, 0.0f) <= 0 && !z2) {
            return yz3Var;
        }
        return yz3Var.w(new lm5(f, om5Var, z2, j, j));
    }

    public static final yz3 G(ic2 ic2Var) {
        return new s86(ic2Var);
    }

    public static void H(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(qx1.m(name, " cannot be cast to ", str));
        a34.m0(classCastException, wk6.class.getName());
        throw classCastException;
    }

    public static final l74 I(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        long j;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        if (Build.VERSION.SDK_INT >= 36) {
            j = backEvent.getFrameTimeMillis();
        } else {
            j = 0;
        }
        return new l74(swipeEdge, progress, touchX, touchY, j);
    }

    public static String J(int i) {
        if (i == 0) {
            return "Clear";
        }
        if (i == 1) {
            return "Src";
        }
        if (i == 2) {
            return "Dst";
        }
        if (i == 3) {
            return "SrcOver";
        }
        if (i == 4) {
            return "DstOver";
        }
        if (i == 5) {
            return "SrcIn";
        }
        if (i == 6) {
            return "DstIn";
        }
        if (i == 7) {
            return "SrcOut";
        }
        if (i == 8) {
            return "DstOut";
        }
        if (i == 9) {
            return "SrcAtop";
        }
        if (i == 10) {
            return "DstAtop";
        }
        if (i == 11) {
            return "Xor";
        }
        if (i == 12) {
            return "Plus";
        }
        if (i == 13) {
            return "Modulate";
        }
        if (i == 14) {
            return "Screen";
        }
        if (i == 15) {
            return "Overlay";
        }
        if (i == 16) {
            return "Darken";
        }
        if (i == 17) {
            return "Lighten";
        }
        if (i == 18) {
            return "ColorDodge";
        }
        if (i == 19) {
            return "ColorBurn";
        }
        if (i == 20) {
            return "HardLight";
        }
        if (i == 21) {
            return "Softlight";
        }
        if (i == 22) {
            return "Difference";
        }
        if (i == 23) {
            return "Exclusion";
        }
        if (i == 24) {
            return "Multiply";
        }
        if (i == 25) {
            return "Hue";
        }
        if (i == 26) {
            return "Saturation";
        }
        if (i == 27) {
            return "Color";
        }
        if (i == 28) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public static String K(long j) {
        if (n(j, 12884901888L)) {
            return "Rgb";
        }
        if (n(j, 12884901889L)) {
            return "Xyz";
        }
        if (n(j, 12884901890L)) {
            return "Lab";
        }
        if (n(j, 17179869187L)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [yz3, java.lang.Object] */
    public static final yz3 L(yz3 yz3Var) {
        return yz3Var.w(new Object());
    }

    public static String M(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            return null;
                        }
                        return "REPEAT_ALL_AND_SHUFFLE";
                    }
                    return "REPEAT_SINGLE";
                }
                return "REPEAT_ALL";
            }
            return "REPEAT_OFF";
        }
        return null;
    }

    public static final void a(AnimeWithProgress animeWithProgress, yz3 yz3Var, ub2 ub2Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        animeWithProgress.getClass();
        ub2Var.getClass();
        kd2Var.f0(-894928327);
        if (kd2Var.h(animeWithProgress)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (kd2Var.f(yz3Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (kd2Var.h(ub2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        boolean z2 = false;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i7 & 1, z)) {
            AnimeListItem anime = animeWithProgress.getAnime();
            Object coverImage = anime.getCoverImage();
            if (coverImage == null) {
                coverImage = anime.getBannerImage();
            }
            Context context = (Context) kd2Var.j(eb.b);
            boolean f = kd2Var.f(coverImage) | kd2Var.f(context);
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (f || Q == obj) {
                bv2 bv2Var = new bv2(context);
                bv2Var.c = coverImage;
                hv2.a(bv2Var, true);
                Q = bv2Var.a();
                kd2Var.n0(Q);
            }
            ev2 ev2Var = (ev2) Q;
            String title = anime.getTitle();
            yz3 g = ar5.g(ar5.c(yz3Var, 1.0f), 120.0f, 0.0f, 2);
            if ((i7 & 896) == 256) {
                z2 = true;
            }
            boolean h = kd2Var.h(anime) | z2;
            Object Q2 = kd2Var.Q();
            if (h || Q2 == obj) {
                Q2 = new n(ub2Var, anime, (byte) 13);
                kd2Var.n0(Q2);
            }
            l36.a(kb0.A(g, false, null, null, false, (sb2) Q2, kd2Var, 0, 31), ((cn5) kd2Var.j(dn5.a)).c, ((mp0) kd2Var.j(op0.a)).p, 0L, 0.0f, 0.0f, null, nx7.R(-1558848300, new fj((Object) ev2Var, (Object) title, (Object) animeWithProgress, (Object) anime, (byte) 5), kd2Var), kd2Var, 12582912, 120);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new df((Object) animeWithProgress, yz3Var, ub2Var, i, (byte) 2);
        }
    }

    public static final void b(yz3 yz3Var, th4 th4Var, long j, long j2, om5 om5Var, os0 os0Var, kd2 kd2Var, int i, int i2) {
        yz3 yz3Var2;
        int i3;
        int i4;
        th4 th4Var2;
        long j3;
        long j4;
        boolean z;
        th4 th4Var3;
        om5 om5Var2;
        long j5;
        yz3 yz3Var3;
        long j6;
        yz3 yz3Var4;
        int i5;
        long j7;
        om5 om5Var3;
        int i6;
        int i7;
        int i8;
        int i9;
        kd2Var.f0(-2011824762);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            yz3Var2 = yz3Var;
        } else if ((i & 6) == 0) {
            yz3Var2 = yz3Var;
            if (kd2Var.f(yz3Var2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            yz3Var2 = yz3Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                th4Var2 = th4Var;
                if (kd2Var.f(th4Var2)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                th4Var2 = th4Var;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            th4Var2 = th4Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (kd2Var.e(j3)) {
                    i8 = 256;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 128;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j4 = j2;
                if (kd2Var.e(j4)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            if (kd2Var.h(os0Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        byte b2 = 1;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                i5 = i3 & (-57345);
                j7 = j4;
                om5Var3 = om5Var;
                yz3Var3 = yz3Var2;
            } else {
                if (i10 != 0) {
                    yz3Var4 = vz3.x;
                } else {
                    yz3Var4 = yz3Var2;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    th4Var2 = new vh4(12.0f, 10.0f, 12.0f, 10.0f);
                }
                if ((i2 & 4) != 0) {
                    j3 = ((mp0) kd2Var.j(op0.a)).p;
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    j4 = ((mp0) kd2Var.j(op0.a)).o;
                    i3 &= -7169;
                }
                i5 = i3 & (-57345);
                j7 = j4;
                yz3Var3 = yz3Var4;
                om5Var3 = ((cn5) kd2Var.j(dn5.a)).c;
            }
            long j8 = j3;
            long j9 = j7;
            kd2Var.r();
            l36.a(yz3Var3, om5Var3, j8, j9, 0.0f, 0.0f, null, nx7.R(-88791711, new u20(th4Var2, os0Var, b2), kd2Var), kd2Var, (i5 & 14) | 12582912 | (i5 & 896) | (i5 & 7168), 112);
            th4Var3 = th4Var2;
            om5Var2 = om5Var3;
            j6 = j8;
            j5 = j9;
        } else {
            kd2Var.Y();
            th4Var3 = th4Var2;
            om5Var2 = om5Var;
            j5 = j4;
            yz3Var3 = yz3Var2;
            j6 = j3;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new v20(yz3Var3, th4Var3, j6, j5, om5Var2, os0Var, i, i2, (byte) 1);
        }
    }

    public static final void c(final ko4 ko4Var, final yz3 yz3Var, final int i, final dz0 dz0Var, final boolean z, final os0 os0Var, kd2 kd2Var, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        yz3 yz3Var2;
        boolean z5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        kd2Var.f0(2125407251);
        if ((i2 & 6) == 0) {
            if (kd2Var.h(ko4Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.d(i)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.f(dz0Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (kd2Var.g(z)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i2) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            int i10 = (i3 & 14) | ((i3 >> 9) & 112);
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            Object obj2 = Q;
            if (Q == obj) {
                kt4 kt4Var = new kt4(z);
                kt4Var.e(ko4Var);
                kd2Var.n0(kt4Var);
                obj2 = kt4Var;
            }
            kt4 kt4Var2 = (kt4) obj2;
            boolean h = kd2Var.h(kt4Var2) | kd2Var.h(ko4Var);
            Object Q2 = kd2Var.Q();
            vz0 vz0Var = null;
            if (h || Q2 == obj) {
                Q2 = new e52(kt4Var2, ko4Var, vz0Var, b2);
                kd2Var.n0(Q2);
            }
            db.f((ic2) Q2, kd2Var, ko4Var);
            Boolean valueOf = Boolean.valueOf(z);
            boolean h2 = kd2Var.h(kt4Var2);
            if ((((i10 & 112) ^ 48) > 32 && kd2Var.g(z)) || (i10 & 48) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z3 | h2;
            Object Q3 = kd2Var.Q();
            if (z6 || Q3 == obj) {
                Q3 = new hu1(kt4Var2, z, null, (byte) 20);
                kd2Var.n0(Q3);
            }
            db.f((ic2) Q3, kd2Var, valueOf);
            uq5 uq5Var = (uq5) kt4Var2.a.getValue();
            int i11 = ((i3 >> 3) & 14) | ((i3 >> 6) & 112);
            yz3Var.getClass();
            dz0Var.getClass();
            final ud1 ud1Var = (ud1) kd2Var.j(bv0.h);
            yz3 p = ar5.p(ar5.c, 3);
            yz3 yz3Var3 = vz3.x;
            if (uq5Var == null) {
                kd2Var.e0(-753667123);
                kd2Var.q(false);
                yz3Var2 = null;
            } else {
                kd2Var.e0(-753667122);
                final long j = uq5Var.a;
                boolean f = kd2Var.f(ud1Var) | kd2Var.e(j);
                if ((((i11 & 112) ^ 48) > 32 && kd2Var.f(dz0Var)) || (i11 & 48) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z7 = f | z4;
                Object Q4 = kd2Var.Q();
                if (z7 || Q4 == obj) {
                    Q4 = new jc2() { // from class: d02
                        @Override // defpackage.jc2
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            xo3 xo3Var = (xo3) obj3;
                            ro3 ro3Var = (ro3) obj4;
                            rx0 rx0Var = (rx0) obj5;
                            xo3Var.getClass();
                            ro3Var.getClass();
                            long j2 = j;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                            ud1 ud1Var2 = ud1.this;
                            float g0 = ud1Var2.g0(intBitsToFloat);
                            float g02 = ud1Var2.g0(Float.intBitsToFloat((int) (j2 & 4294967295L)));
                            long floatToRawIntBits = (Float.floatToRawIntBits(g02) & 4294967295L) | (Float.floatToRawIntBits(g0) << 32);
                            float h3 = rx0.h(rx0Var.a);
                            float g = rx0.g(rx0Var.a);
                            long floatToRawIntBits2 = Float.floatToRawIntBits(h3);
                            long a2 = dz0Var.a(floatToRawIntBits, (Float.floatToRawIntBits(g) & 4294967295L) | (floatToRawIntBits2 << 32));
                            em4 p2 = ro3Var.p(rx0.a(rx0Var.a, 0, io3.h0(Float.intBitsToFloat((int) (a2 >> 32)) * Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), 0, io3.h0(Float.intBitsToFloat((int) (a2 & 4294967295L)) * Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), 5));
                            return xo3Var.L(p2.x, p2.y, ot1.x, new r0(p2, (byte) 6));
                        }
                    };
                    kd2Var.n0(Q4);
                }
                yz3 A = tl7.A(yz3Var3, (jc2) Q4);
                kd2Var.q(false);
                yz3Var2 = A;
            }
            if (yz3Var2 != null) {
                yz3Var3 = yz3Var2;
            }
            zz.f(ko4Var, yz3Var.w(p.w(yz3Var3)), i, kd2Var, i3 & 910);
            if (((Boolean) kt4Var2.b.getValue()).booleanValue()) {
                kd2Var.e0(1600449148);
                os0Var.invoke(kd2Var, Integer.valueOf((i3 >> 15) & 14));
                z5 = false;
            } else {
                z5 = false;
                kd2Var.e0(1597348559);
            }
            kd2Var.q(z5);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: ly0
                @Override // defpackage.ic2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    wk6.c(ko4.this, yz3Var, i, dz0Var, z, os0Var, (kd2) obj3, kb0.N(i2 | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static final g13 d(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new g13(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static final void e(AnimeSchedule animeSchedule, ub2 ub2Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        animeSchedule.getClass();
        kd2Var.f0(56683079);
        if ((i & 6) == 0) {
            if (kd2Var.h(animeSchedule)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(ub2Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        byte b2 = 0;
        byte b3 = 1;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            Context context = (Context) kd2Var.j(eb.b);
            Object extraLarge = animeSchedule.getCoverImage().getExtraLarge();
            if (extraLarge == null) {
                extraLarge = animeSchedule.getCoverImage().getLarge();
            }
            boolean f = kd2Var.f(extraLarge) | kd2Var.f(context);
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (f || Q == obj) {
                bv2 bv2Var = new bv2(context);
                bv2Var.c = extraLarge;
                hv2.a(bv2Var, true);
                Q = bv2Var.a();
                kd2Var.n0(Q);
            }
            ev2 ev2Var = (ev2) Q;
            yz3 g = ar5.g(ar5.c(vz3.x, 1.0f), 110.0f, 0.0f, 2);
            if ((i2 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean h = z2 | kd2Var.h(animeSchedule);
            Object Q2 = kd2Var.Q();
            if (h || Q2 == obj) {
                Q2 = new lb5(ub2Var, animeSchedule, b2);
                kd2Var.n0(Q2);
            }
            l36.a(kb0.A(g, false, null, null, false, (sb2) Q2, kd2Var, 6, 31), ((cn5) kd2Var.j(dn5.a)).c, ((mp0) kd2Var.j(op0.a)).p, 0L, 0.0f, 0.0f, null, nx7.R(687892428, new q(animeSchedule, ev2Var, b3), kd2Var), kd2Var, 12582912, 120);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new mo((byte) 7, i, animeSchedule, ub2Var);
        }
    }

    public static final void f(int i, Integer num, int i2, MediaStatus mediaStatus, yz3 yz3Var, kd2 kd2Var, int i3) {
        int i4;
        int i5;
        int i6;
        int ordinal;
        int i7;
        boolean z;
        kd2 kd2Var2;
        int i8;
        int i9;
        String str;
        kd2Var.f0(-495979718);
        if (kd2Var.d(i)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i10 = i3 | i4;
        if (kd2Var.f(num)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i11 = i10 | i5;
        if (kd2Var.d(i2)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i12 = i11 | i6;
        if (mediaStatus == null) {
            ordinal = -1;
        } else {
            ordinal = mediaStatus.ordinal();
        }
        if (kd2Var.d(ordinal)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i13 = i12 | i7;
        if ((i13 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i13 & 1, z)) {
            MediaStatus mediaStatus2 = MediaStatus.RELEASING;
            Object obj = "?";
            if (mediaStatus != mediaStatus2 && num != null) {
                obj = num;
            }
            if (mediaStatus == mediaStatus2) {
                StringBuilder sb = new StringBuilder("Episode ");
                sb.append(i);
                sb.append(" / ");
                sb.append(obj);
                sb.append(" (");
                str = zo5.k(i2, ")", sb);
            } else {
                str = "Episode " + i + " / " + obj;
            }
            yz3 c2 = ar5.c(yz3Var, 1.0f);
            xp0 a2 = vp0.a(new vr(6.0f, true, new ze0((byte) 6)), pk2.L, kd2Var, 54);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, c2);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z2 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z2) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var, a2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var, valueOf);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            xd6 xd6Var = ((nl6) kd2Var.j(pl6.a)).i;
            tq1 tq1Var = op0.a;
            long j = ((mp0) kd2Var.j(tq1Var)).o;
            vz3 vz3Var = vz3.x;
            yc6.b(str, ar5.c(vz3Var, 1.0f), j, 0L, null, null, 0L, new c86(5), 0L, 2, false, 1, 0, xd6Var, kd2Var, 48, 24960, 109560);
            kd2Var2 = kd2Var;
            yz3 e2 = ar5.e(ar5.c(vz3Var, 1.0f), 6.0f);
            o75 o75Var = tm5.b;
            yz3 k = n03.k(e2, o75Var);
            long j2 = ((mp0) kd2Var2.j(tq1Var)).r;
            ao2 ao2Var = io3.h;
            yz3 h = bx7.h(k, j2, ao2Var);
            vo3 c3 = b90.c(pk2.B, false);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, h);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, c3);
            ss5.i(ys0Var, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            float f = 0.0f;
            if (i2 > 0) {
                i8 = i;
                i9 = i2;
                f = db.B(i8 / i9, 0.0f, 1.0f);
            } else {
                i8 = i;
                i9 = i2;
            }
            b90.a(bx7.h(n03.k(ar5.c(vz3Var, f).w(ar5.b), o75Var), ((mp0) kd2Var2.j(tq1Var)).a, ao2Var), kd2Var2, 0);
            kd2Var2.q(true);
            kd2Var2.q(true);
        } else {
            kd2Var2 = kd2Var;
            i8 = i;
            i9 = i2;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new nm(i8, num, i9, mediaStatus, yz3Var, i3);
        }
    }

    public static final void g(n86 n86Var, final Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (!nd6.d(j) && charSequence.length() != 0) {
            PackageManager packageManager = context.getPackageManager();
            List list = (List) sw0.I.invoke(context);
            if (!list.isEmpty()) {
                n86Var.a();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
                    n86Var.a.a(new w86(new mu4(i), resolveInfo.loadLabel(packageManager).toString(), 0, new ub2() { // from class: nu4
                        @Override // defpackage.ub2
                        public final Object invoke(Object obj) {
                            sw0.J.g(context, resolveInfo, Boolean.valueOf(z), charSequence, new nd6(j));
                            ((b96) obj).close();
                            return pn6.a;
                        }
                    }));
                }
                n86Var.a();
            }
        }
    }

    public static Collection h(ArrayList arrayList) {
        if ((arrayList instanceof j73) && !(arrayList instanceof k73)) {
            H(arrayList, "kotlin.collections.MutableCollection");
            throw null;
        }
        return arrayList;
    }

    public static Map i(Object obj) {
        if ((obj instanceof j73) && !(obj instanceof n73)) {
            H(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            a34.m0(e2, wk6.class.getName());
            throw e2;
        }
    }

    public static void j(int i, Object obj) {
        if (obj != null && !u(i, obj)) {
            H(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
    }

    public static final void k(int i) {
        if (i >= 1) {
            return;
        }
        ze0.e(qx1.h(i, "Expected positive parallelism level, but got "));
    }

    public static final long l(long j, jq1 jq1Var) {
        long j2;
        int ordinal = jq1Var.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal == 6) {
                            j2 = 86400000;
                        } else {
                            v71.g(jq1Var, "Wrong unit for millisMultiplier: ");
                            return 0L;
                        }
                    } else {
                        j2 = 3600000;
                    }
                } else {
                    j2 = 60000;
                }
            } else {
                j2 = 1000;
            }
        } else {
            j2 = 1;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 == 1) {
            if (j <= 4611686018427387903L) {
                return j;
            }
        } else {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (numberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (numberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        }
        return 4611686018427387903L;
    }

    public static int m(int i, int i2, String str, boolean z) {
        boolean z2;
        while (i < i2) {
            char charAt = str.charAt(i);
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean n(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final Object o(ev2 ev2Var, w4 w4Var) {
        Object obj = ev2Var.r.a.get(w4Var);
        if (obj == null) {
            Object obj2 = ev2Var.t.n.a.get(w4Var);
            if (obj2 == null) {
                return w4Var.a;
            }
            return obj2;
        }
        return obj;
    }

    public static final Object p(mg4 mg4Var, w4 w4Var) {
        Object obj = mg4Var.j.a.get(w4Var);
        if (obj == null) {
            return w4Var.a;
        }
        return obj;
    }

    public static final boolean q(xd6 xd6Var) {
        ys1 ys1Var;
        um4 um4Var;
        kn4 kn4Var = xd6Var.c;
        if (kn4Var != null && (um4Var = kn4Var.a) != null) {
            ys1Var = new ys1(um4Var.b);
        } else {
            ys1Var = null;
        }
        boolean z = false;
        if (ys1Var != null && ys1Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static KeyEvent r(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("android.intent.extra.KEY_EVENT")) {
                    return (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
                }
            } catch (RuntimeException e2) {
                kb0.P("DefaultActionFactory", "Failed to get parcelable key event", e2);
            }
        }
        return null;
    }

    public static final String s(gq2 gq2Var) {
        ((CIOEngineContainer) gq2Var).getClass();
        String f = z05.a(fe0.class).f();
        if (f == null) {
            return "CIO";
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [yz3, java.lang.Object] */
    public static final yz3 t(yz3 yz3Var) {
        return yz3Var.w(new Object());
    }

    public static boolean u(int i, Object obj) {
        int i2;
        if (obj instanceof ec2) {
            if (obj instanceof sc2) {
                i2 = ((sc2) obj).getArity();
            } else if (obj instanceof sb2) {
                i2 = 0;
            } else if (obj instanceof ub2) {
                i2 = 1;
            } else if (obj instanceof ic2) {
                i2 = 2;
            } else if (obj instanceof jc2) {
                i2 = 3;
            } else if (obj instanceof kc2) {
                i2 = 4;
            } else if (obj instanceof lc2) {
                i2 = 5;
            } else if (obj instanceof mc2) {
                i2 = 6;
            } else if (obj instanceof nc2) {
                i2 = 7;
            } else if (obj instanceof oc2) {
                i2 = 8;
            } else if (obj instanceof pc2) {
                i2 = 9;
            } else if (obj instanceof tb2) {
                i2 = 10;
            } else if (obj instanceof vb2) {
                i2 = 11;
            } else if (obj instanceof xb2) {
                i2 = 13;
            } else if (obj instanceof yb2) {
                i2 = 14;
            } else if (obj instanceof zb2) {
                i2 = 15;
            } else if (obj instanceof ac2) {
                i2 = 16;
            } else if (obj instanceof bc2) {
                i2 = 17;
            } else if (obj instanceof cc2) {
                i2 = 18;
            } else if (obj instanceof dc2) {
                i2 = 19;
            } else if (obj instanceof fc2) {
                i2 = 20;
            } else if (obj instanceof gc2) {
                i2 = 21;
            } else {
                i2 = -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean v(Object obj) {
        if (obj instanceof Map.Entry) {
            if (!(obj instanceof j73) || (obj instanceof m73)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean w(za3 za3Var) {
        za3 za3Var2;
        if (za3Var.E != null) {
            za3 v = za3Var.v();
            if (v != null) {
                za3Var2 = v.E;
            } else {
                za3Var2 = null;
            }
            if (za3Var2 == null || za3Var.d0.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final o1 x(Object[] objArr) {
        objArr.getClass();
        return new o1(objArr);
    }

    public static boolean y(qj4 qj4Var) {
        return !b06.A(qj4Var.b(), ".class", true);
    }

    public static float z(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            float f8 = fArr2[fArr.length - 1];
            if (f7 == 0.0f) {
                return 0.0f;
            }
            return (f8 / f7) * f;
        }
        if (i2 == -1) {
            float f9 = fArr[0];
            f4 = fArr2[0];
            f5 = f9;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f10 = fArr[i2];
            float f11 = fArr[i];
            f2 = fArr2[i2];
            f3 = f10;
            f4 = fArr2[i];
            f5 = f11;
        }
        if (f3 == f5) {
            f6 = 0.0f;
        } else {
            f6 = (abs - f3) / (f5 - f3);
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f6))) + f2) * signum;
    }
}
