package defpackage;

import android.content.Context;
import android.text.Layout;
import androidx.work.impl.WorkDatabase;
import com.anistation.android.R;
import com.anistation.model.Info;
import com.anistation.model.MediaFormat;
import com.anistation.model.MediaSeason;
import com.anistation.model.MediaSource;
import com.anistation.model.MediaStatus;
import com.anistation.model.NextAiringEpisode;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.download.OfflineDownloadMetadataKt;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class bb4 {
    public static final t53 K;
    public static final k55 L;
    public static final zm1 M;
    public static final q12[] N;
    public static final os0 x = new os0(753179141, false, new ps0(5));
    public static final os0 y = new os0(929917960, false, new ps0(6));
    public static final os0 z = new os0(-465463813, false, new vs0(26));
    public static final os0 A = new os0(157558404, false, new ys0(9));
    public static final os0 B = new os0(948868845, false, new ys0(23));
    public static final os0 C = new os0(-1087726836, false, new ys0(25));
    public static final os0 D = new os0(1170644779, false, new ys0(26));
    public static final os0 E = new os0(-865950902, false, new ys0(10));
    public static final os0 F = new os0(991512191, false, new ys0(11));
    public static final os0 G = new os0(-780426200, false, new ys0(12));
    public static final os0 H = new os0(1477945415, false, new ys0(13));
    public static final os0 I = new os0(-91135704, false, new ys0(14));
    public static final os0 J = new os0(1187000159, false, new ys0(15));

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, k55] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, zm1] */
    static {
        new os0(-221049169, false, new ys0((byte) 16));
        new os0(685031959, false, new ys0((byte) 19));
        new os0(624510084, false, new ys0((byte) 20));
        new os0(1764870660, false, new ys0((byte) 21));
        new os0(-957385100, false, new ys0((byte) 22));
        new os0(-2125621938, false, new ys0((byte) 24));
        K = new t53((byte) 27);
        L = new Object();
        M = new Object();
        N = new q12[]{new q12("usage_and_diagnostics_listener", -1, 1L, true), new q12("usage_and_diagnostics_consents", -1, 1L, true), new q12("usage_and_diagnostics_check_consents", -1, 1L, true), new q12("usage_and_diagnostics_settings_access", -1, 1L, true), new q12("el_capitan", -1, 1L, false), new q12("stats", -1, 1L, true)};
    }

    public static final n05 A(h82 h82Var) {
        fa4 fa4Var;
        if (h82Var.K && (fa4Var = h82Var.E) != null) {
            ha3 B2 = te4.B(fa4Var);
            if (!B2.m()) {
                B2 = null;
            }
            if (B2 != null) {
                return h82Var.d1(B2);
            }
        }
        return n05.e;
    }

    public static kr0 B(String str, v71 v71Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(px4.a(cy.class));
        for (Class cls : new Class[0]) {
            v94.l(cls, "Null interface");
            hashSet.add(px4.a(cls));
        }
        zd1 a = zd1.a(Context.class);
        if (!hashSet.contains(a.a)) {
            hashSet2.add(a);
            return new kr0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new fs0((Object) str, (Object) v71Var, (byte) 4), hashSet3);
        }
        ze0.k("Components are not allowed to depend on interfaces they themselves provide.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0027, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.h82 C(defpackage.h82 r9) {
        /*
            xz3 r0 = r9.x
            boolean r0 = r0.K
            r1 = 0
            if (r0 != 0) goto L9
            goto Lab
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.ez2.b(r0)
        L10:
            z44 r0 = new z44
            r2 = 16
            xz3[] r3 = new defpackage.xz3[r2]
            r4 = 0
            r0.<init>(r3, r4)
            xz3 r9 = r9.x
            xz3 r3 = r9.C
            if (r3 != 0) goto L24
            defpackage.wc7.f(r0, r9)
            goto L27
        L24:
            r0.b(r3)
        L27:
            int r9 = r0.z
            if (r9 == 0) goto Lab
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.m(r9)
            xz3 r9 = (defpackage.xz3) r9
            int r3 = r9.A
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3d
            defpackage.wc7.f(r0, r9)
            goto L27
        L3d:
            if (r9 == 0) goto L27
            int r3 = r9.z
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La8
            r3 = r1
        L46:
            if (r9 == 0) goto L27
            boolean r5 = r9 instanceof defpackage.h82
            r6 = 1
            if (r5 == 0) goto L6d
            h82 r9 = (defpackage.h82) r9
            xz3 r5 = r9.x
            boolean r5 = r5.K
            if (r5 == 0) goto La3
            d82 r5 = r9.f1()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L6c
            if (r5 == r6) goto L6c
            r6 = 2
            if (r5 == r6) goto L6c
            r9 = 3
            if (r5 != r9) goto L68
            goto La3
        L68:
            defpackage.ze0.l()
            return r1
        L6c:
            return r9
        L6d:
            int r5 = r9.z
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto La3
            boolean r5 = r9 instanceof defpackage.zc1
            if (r5 == 0) goto La3
            r5 = r9
            zc1 r5 = (defpackage.zc1) r5
            xz3 r5 = r5.M
            r7 = r4
        L7d:
            if (r5 == 0) goto La0
            int r8 = r5.z
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L9d
            int r7 = r7 + 1
            if (r7 != r6) goto L8b
            r9 = r5
            goto L9d
        L8b:
            if (r3 != 0) goto L94
            z44 r3 = new z44
            xz3[] r8 = new defpackage.xz3[r2]
            r3.<init>(r8, r4)
        L94:
            if (r9 == 0) goto L9a
            r3.b(r9)
            r9 = r1
        L9a:
            r3.b(r5)
        L9d:
            xz3 r5 = r5.C
            goto L7d
        La0:
            if (r7 != r6) goto La3
            goto L46
        La3:
            xz3 r9 = defpackage.wc7.J(r3)
            goto L46
        La8:
            xz3 r9 = r9.C
            goto L3d
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb4.C(h82):h82");
    }

    public static final ArrayList E(j23 j23Var) {
        List m;
        j23Var.getClass();
        za3 t0 = ((yl3) j23Var).t0();
        boolean K2 = K(t0);
        d44 d44Var = (d44) t0.o();
        z44 z44Var = (z44) d44Var.y;
        ArrayList arrayList = new ArrayList(z44Var.z);
        int i = z44Var.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var = (za3) d44Var.get(i2);
            if (K2) {
                m = za3Var.l();
            } else {
                m = za3Var.m();
            }
            arrayList.add(m);
        }
        return arrayList;
    }

    public static final int F(Layout layout, int i, boolean z2) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z2) {
                    return lineForOffset - 1;
                }
            } else if (!z2) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static int G(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    public static yz3 H(yz3 yz3Var, u34 u34Var) {
        return yz3Var.w(new ho2(u34Var));
    }

    public static al5 I(Set set, zw2 zw2Var) {
        io3.w(set, "set1");
        io3.w(zw2Var, "set2");
        return new al5(set, zw2Var, (byte) 0);
    }

    public static final boolean J(h82 h82Var) {
        za3 za3Var;
        fa4 fa4Var;
        za3 za3Var2;
        fa4 fa4Var2 = h82Var.E;
        if (fa4Var2 != null && (za3Var = fa4Var2.R) != null && za3Var.J() && (fa4Var = h82Var.E) != null && (za3Var2 = fa4Var.R) != null && za3Var2.I()) {
            return true;
        }
        return false;
    }

    public static final boolean K(za3 za3Var) {
        int ordinal = za3Var.d0.d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            za3 v = za3Var.v();
                            if (v != null) {
                                return K(v);
                            }
                            ze0.k("no parent for idle node");
                            return false;
                        }
                        ze0.l();
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static List L(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(objArr));
            }
            return Collections.singletonList(objArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    public static final gt0 M(eg3 eg3Var, kd2 kd2Var) {
        Object obj = (og3) kd2Var.j(vj3.a);
        boolean f = kd2Var.f(obj);
        Object Q = kd2Var.Q();
        Object obj2 = au0.a;
        if (f || Q == obj2) {
            Q = new gt0();
            kd2Var.n0(Q);
        }
        gt0 gt0Var = (gt0) Q;
        boolean h = kd2Var.h(gt0Var) | kd2Var.h(obj);
        Object Q2 = kd2Var.Q();
        if (h || Q2 == obj2) {
            Q2 = new r82(obj, gt0Var, (byte) 24);
            kd2Var.n0(Q2);
        }
        db.d(gt0Var, obj, (ub2) Q2, kd2Var);
        boolean h2 = kd2Var.h(gt0Var) | kd2Var.d(eg3Var.ordinal());
        Object Q3 = kd2Var.Q();
        if (h2 || Q3 == obj2) {
            Q3 = new yh(gt0Var, eg3Var, null, (byte) 19);
            kd2Var.n0(Q3);
        }
        db.g(gt0Var, eg3Var, (ic2) Q3, kd2Var);
        return gt0Var;
    }

    public static String N(String str) {
        CharSequence charSequence;
        Pattern compile = Pattern.compile("[\\\\/:*?\"<>|\\p{Cntrl}]");
        compile.getClass();
        str.getClass();
        String replaceAll = compile.matcher(str).replaceAll(" ");
        replaceAll.getClass();
        Pattern compile2 = Pattern.compile("\\s+");
        compile2.getClass();
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll(" ");
        replaceAll2.getClass();
        String obj = uz5.w0(replaceAll2).toString();
        char[] cArr = {'.'};
        obj.getClass();
        int length = obj.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char charAt = obj.charAt(length);
                int length2 = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        if (charAt == cArr[i2]) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 >= 0) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    charSequence = obj.subSequence(0, length + 1);
                    break;
                }
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, w05] */
    public static final Object O(h82 h82Var, int i, ub2 ub2Var) {
        int i2;
        int i3;
        Object obj;
        xz3 xz3Var;
        gd3 e1;
        int e;
        kf kfVar;
        if (!h82Var.x.K) {
            ez2.b("visitAncestors called on an unattached node");
        }
        xz3 xz3Var2 = h82Var.x.B;
        za3 O = wc7.O(h82Var);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            obj = null;
            if (O != null) {
                if ((((xz3) O.c0.D).A & 1024) != 0) {
                    while (xz3Var2 != null) {
                        if ((xz3Var2.z & 1024) != 0) {
                            xz3Var = xz3Var2;
                            z44 z44Var = null;
                            while (xz3Var != null) {
                                if (xz3Var instanceof h82) {
                                    break loop0;
                                }
                                if ((xz3Var.z & 1024) != 0 && (xz3Var instanceof zc1)) {
                                    int i4 = 0;
                                    for (xz3 xz3Var3 = ((zc1) xz3Var).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                                        if ((xz3Var3.z & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                xz3Var = xz3Var3;
                                            } else {
                                                if (z44Var == null) {
                                                    z44Var = new z44(new xz3[16], 0);
                                                }
                                                if (xz3Var != null) {
                                                    z44Var.b(xz3Var);
                                                    xz3Var = null;
                                                }
                                                z44Var.b(xz3Var3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                xz3Var = wc7.J(z44Var);
                            }
                        }
                        xz3Var2 = xz3Var2.B;
                    }
                }
                O = O.v();
                if (O != null && (kfVar = O.c0) != null) {
                    xz3Var2 = (z66) kfVar.C;
                } else {
                    xz3Var2 = null;
                }
            } else {
                xz3Var = null;
                break;
            }
        }
        h82 h82Var2 = (h82) xz3Var;
        if ((h82Var2 == null || !a34.i(h82Var2.e1(), h82Var.e1())) && (e1 = h82Var.e1()) != null) {
            int i5 = 5;
            if (i != 5) {
                i5 = 6;
                if (i != 6) {
                    i5 = 3;
                    if (i != 3) {
                        i5 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i3 = 2;
                            } else if (i != 2) {
                                ze0.m("Unsupported direction for beyond bounds layout");
                            }
                            if (e1.L.a() <= 0 && e1.L.d() && e1.K) {
                                boolean b1 = e1.b1(i3);
                                hd3 hd3Var = e1.L;
                                if (b1) {
                                    e = hd3Var.b();
                                } else {
                                    e = hd3Var.e();
                                }
                                ?? obj2 = new Object();
                                v90 v90Var = e1.M;
                                v90Var.getClass();
                                cd3 cd3Var = new cd3(e, e);
                                v90Var.a.b(cd3Var);
                                obj2.x = cd3Var;
                                int c = e1.L.c() * 2;
                                int a = e1.L.a();
                                if (c > a) {
                                    c = a;
                                }
                                while (obj == null && e1.a1((cd3) obj2.x, i3) && i2 < c) {
                                    cd3 cd3Var2 = (cd3) obj2.x;
                                    int i6 = cd3Var2.a;
                                    int i7 = cd3Var2.b;
                                    if (e1.b1(i3)) {
                                        i7++;
                                    } else {
                                        i6--;
                                    }
                                    v90 v90Var2 = e1.M;
                                    v90Var2.getClass();
                                    cd3 cd3Var3 = new cd3(i6, i7);
                                    v90Var2.a.b(cd3Var3);
                                    e1.M.a.k((cd3) obj2.x);
                                    obj2.x = cd3Var3;
                                    i2++;
                                    wc7.O(e1).k();
                                    obj = ub2Var.invoke(new fd3(e1, obj2, i3));
                                }
                                e1.M.a.k((cd3) obj2.x);
                                wc7.O(e1).k();
                                return obj;
                            }
                            return ub2Var.invoke(gd3.O);
                        }
                    }
                }
            }
            i3 = i5;
            if (e1.L.a() <= 0) {
            }
            return ub2Var.invoke(gd3.O);
        }
        return null;
    }

    public static int P(int i, ByteBuffer byteBuffer) {
        boolean z2;
        boolean z3;
        boolean z4;
        while (true) {
            boolean z5 = false;
            if (i <= byteBuffer.limit() - 4) {
                int i2 = byteBuffer.getInt(i);
                int i3 = i2 & (-256);
                if (i3 == 256) {
                    break;
                }
                if (i3 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                io3.A("Invalid Nal units", z4);
                int i4 = i2 & 255;
                if (i4 == 1) {
                    return i + 1;
                }
                if (i4 == 0) {
                    z5 = true;
                }
                io3.A("Invalid Nal units", z5);
                i++;
            } else {
                if (i <= byteBuffer.limit() - 3) {
                    if (byteBuffer.getShort(i) == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    io3.A("Invalid NAL units", z3);
                    byte b = byteBuffer.get(i + 2);
                    if (b != 1) {
                        if (b == 0) {
                            z5 = true;
                        }
                        io3.A("Invalid NAL units", z5);
                    }
                } else {
                    while (i < byteBuffer.limit()) {
                        if (byteBuffer.get(i) == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        io3.A("Invalid NAL units", z2);
                        i++;
                    }
                }
                return byteBuffer.limit();
            }
        }
        return i;
    }

    public static final yz3 Q(yz3 yz3Var, boolean z2, boolean z3, sb2 sb2Var) {
        if (z2 && o06.a) {
            if (z3) {
                yz3Var = yz3Var.w(new p06(M));
            }
            return yz3Var.w(new m06(sb2Var));
        }
        return yz3Var;
    }

    public static String R(OfflineDownloadMetadata offlineDownloadMetadata, String str, String str2, String str3) {
        do3 do3Var;
        String str4;
        String str5;
        String str6;
        str.getClass();
        String str7 = "vtt";
        String n0 = uz5.n0('.', uz5.p0(str, '?'), "vtt");
        Locale locale = Locale.ROOT;
        String lowerCase = n0.toLowerCase(locale);
        lowerCase.getClass();
        String str8 = null;
        if (!ms.U0(new String[]{"vtt", "srt", "ass", "ssa"}).contains(lowerCase)) {
            lowerCase = null;
        }
        if (lowerCase != null) {
            str7 = lowerCase;
        }
        Pattern compile = Pattern.compile("(?:track_\\d+_)?([a-z]{2,3})(?:_[a-z]+)?\\.vtt", 66);
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        if (!matcher.find(0)) {
            do3Var = null;
        } else {
            do3Var = new do3(matcher, str);
        }
        if (do3Var != null && (str6 = (String) yo0.n0(1, do3Var.a())) != null) {
            str4 = str6.toLowerCase(locale);
            str4.getClass();
        } else {
            str4 = null;
        }
        if (str4 != null && !str4.equals("und")) {
            str5 = N(str4);
        } else {
            if (str2 != null && !uz5.V(str2)) {
                String lowerCase2 = str2.toLowerCase(locale);
                lowerCase2.getClass();
                if (!lowerCase2.equals("und")) {
                    str5 = N(str2);
                }
            }
            str5 = "sub";
            if (str3 != null && !uz5.V(str3)) {
                String q0 = yo0.q0(te4.I("CR", "Fun", "Ani", "HID", "VRV", "ADN", "Wakanim", "Crunchyroll", "Funimation"), "|", null, null, null, 62);
                Pattern compile2 = Pattern.compile("\\s*\\((" + q0 + ")\\)", 66);
                compile2.getClass();
                String replaceAll = compile2.matcher(str3).replaceAll("");
                replaceAll.getClass();
                Pattern compile3 = Pattern.compile("\\s+(" + q0 + ")(?=\\))", 66);
                compile3.getClass();
                String replaceAll2 = compile3.matcher(replaceAll).replaceAll("");
                replaceAll2.getClass();
                Pattern compile4 = Pattern.compile("\\s*\\(\\s*\\)");
                compile4.getClass();
                String replaceAll3 = compile4.matcher(replaceAll2).replaceAll("");
                replaceAll3.getClass();
                String obj = uz5.w0(replaceAll3).toString();
                Pattern compile5 = Pattern.compile("\\s{2,}");
                compile5.getClass();
                obj.getClass();
                String replaceAll4 = compile5.matcher(obj).replaceAll(" ");
                replaceAll4.getClass();
                String lowerCase3 = replaceAll4.toLowerCase(locale);
                lowerCase3.getClass();
                Pattern compile6 = Pattern.compile("[^a-z0-9]+");
                compile6.getClass();
                String replaceAll5 = compile6.matcher(lowerCase3).replaceAll("");
                replaceAll5.getClass();
                if (!uz5.V(replaceAll5)) {
                    str8 = replaceAll5;
                }
                if (str8 != null) {
                    str5 = str8;
                }
            }
        }
        return qx1.n(p(offlineDownloadMetadata), ".", str5, ".", str7);
    }

    public static final void a(xi6 xi6Var, yz3 yz3Var, ub2 ub2Var, e7 e7Var, ub2 ub2Var2, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        kd2Var.f0(511725103);
        if ((i & 6) == 0) {
            if (kd2Var.f(xi6Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(ub2Var)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.f(e7Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.h(ub2Var2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((i & 196608) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i2 & 1, z2)) {
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = yj.z;
                kd2Var.n0(Q);
            }
            b(xi6Var, yz3Var, ub2Var, e7Var, ub2Var2, (ub2) Q, os0Var, kd2Var, 196608 | (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | ((i2 << 3) & 3670016));
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new zj(xi6Var, yz3Var, ub2Var, e7Var, ub2Var2, os0Var, i);
        }
    }

    public static final void b(xi6 xi6Var, yz3 yz3Var, ub2 ub2Var, e7 e7Var, ub2 ub2Var2, ub2 ub2Var3, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        ub2 ub2Var4;
        kd2 kd2Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        qi6 qi6Var;
        Object obj;
        p44 p44Var;
        qi6 qi6Var2;
        qk qkVar;
        zt5 zt5Var;
        qi6 qi6Var3;
        boolean z7;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        qt0 qt0Var = xi6Var.a;
        kd2Var.f0(1935038908);
        if ((i & 6) == 0) {
            if (kd2Var.f(xi6Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(ub2Var)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.f(e7Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.h(ub2Var2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (kd2Var.h(ub2Var3)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        os0 os0Var2 = os0Var;
        if ((1572864 & i) == 0) {
            if (kd2Var.h(os0Var2)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((599187 & i2) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i2 & 1, z2)) {
            int i13 = i2 & 14;
            if (i13 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object Q = kd2Var.Q();
            Object obj2 = au0.a;
            if (z3 || Q == obj2) {
                Q = new qk(xi6Var, e7Var);
                kd2Var.n0(Q);
            }
            qk qkVar2 = (qk) Q;
            if (i13 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object Q2 = kd2Var.Q();
            if (z4 || Q2 == obj2) {
                Q2 = xt5.f(qt0Var.v());
                kd2Var.n0(Q2);
            }
            zt5 zt5Var2 = (zt5) Q2;
            ti4 ti4Var = xi6Var.e;
            ti4 ti4Var2 = xi6Var.d;
            Object value = ti4Var.getValue();
            if (i13 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean f = kd2Var.f(value) | z5;
            Object Q3 = kd2Var.Q();
            if (f || Q3 == obj2) {
                long[] jArr = cb5.a;
                Q3 = new p44();
                kd2Var.n0(Q3);
            }
            p44 p44Var2 = (p44) Q3;
            if (!zt5Var2.contains(qt0Var.v())) {
                zt5Var2.clear();
                zt5Var2.add(qt0Var.v());
            }
            if (a34.i(qt0Var.v(), ti4Var2.getValue()) && ti4Var.getValue() == null) {
                if (zt5Var2.size() != 1 || !a34.i(zt5Var2.get(0), qt0Var.v())) {
                    zt5Var2.clear();
                    zt5Var2.add(qt0Var.v());
                }
                if (p44Var2.e != 1 || p44Var2.c(qt0Var.v())) {
                    p44Var2.a();
                }
                qkVar2.b = e7Var;
            }
            Object value2 = ti4Var.getValue();
            if (value2 != null && !value2.equals(qt0Var.v())) {
                ListIterator listIterator = zt5Var2.listIterator();
                int i14 = 0;
                while (true) {
                    gl2 gl2Var = (gl2) listIterator;
                    if (gl2Var.hasNext()) {
                        i3 = i2;
                        if (a34.i(ub2Var2.invoke(gl2Var.next()), ub2Var2.invoke(value2))) {
                            i5 = i14;
                            break;
                        } else {
                            i14++;
                            i2 = i3;
                        }
                    } else {
                        i3 = i2;
                        i5 = -1;
                        break;
                    }
                }
                if (i5 == -1) {
                    zt5Var2.add(value2);
                } else if (!a34.i(zt5Var2.get(i5), value2)) {
                    zt5Var2.set(i5, value2);
                }
            } else {
                i3 = i2;
            }
            if (!a34.i(qt0Var.v(), ti4Var2.getValue())) {
                ListIterator listIterator2 = zt5Var2.listIterator();
                int i15 = 0;
                while (true) {
                    gl2 gl2Var2 = (gl2) listIterator2;
                    if (gl2Var2.hasNext()) {
                        if (a34.i(ub2Var2.invoke(gl2Var2.next()), ub2Var2.invoke(ti4Var2.getValue()))) {
                            i4 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 == -1) {
                    zt5Var2.add(ti4Var2.getValue());
                } else if (!a34.i(zt5Var2.get(i4), ti4Var2.getValue()) || i4 != zt5Var2.size() - 1) {
                    a34.i(ti4Var2.getValue(), zt5Var2.get(i4));
                    zt5Var2.remove(i4);
                    zt5Var2.add(ti4Var2.getValue());
                }
            }
            Object value3 = ti4Var.getValue();
            boolean f2 = kd2Var.f(value3);
            Object Q4 = kd2Var.Q();
            if (f2 || Q4 == obj2) {
                if (value3 != null) {
                    Q4 = new sk4(qkVar2, ti4Var2.getValue(), value3);
                } else {
                    Q4 = null;
                }
                kd2Var.n0(Q4);
            }
            sk4 sk4Var = (sk4) Q4;
            boolean f3 = kd2Var.f(sk4Var);
            if ((i3 & 458752) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z8 = f3 | z6;
            Object Q5 = kd2Var.Q();
            if (!z8 && Q5 != obj2) {
                obj = Q5;
                qi6Var = null;
            } else if (sk4Var == null || ub2Var3.invoke(sk4Var) == null) {
                qi6Var = null;
                kd2Var.n0(null);
                obj = null;
            } else {
                ov3.d();
                return;
            }
            if (obj == null) {
                if (!p44Var2.b(ti4Var2.getValue()) || !p44Var2.b(qt0Var.v()) || (value3 != null && !p44Var2.b(value3))) {
                    boolean z9 = false;
                    kd2Var.e0(-302069574);
                    p44Var2.a();
                    int size = zt5Var2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = zt5Var2.get(i16);
                        p44 p44Var3 = p44Var2;
                        qi6 qi6Var4 = qi6Var;
                        qk qkVar3 = qkVar2;
                        zt5 zt5Var3 = zt5Var2;
                        zt5Var2 = zt5Var3;
                        p44Var3.n(obj3, nx7.R(427839334, new fk(obj3, xi6Var, sk4Var, ub2Var, qkVar3, zt5Var3, os0Var2), kd2Var));
                        i16++;
                        p44Var2 = p44Var3;
                        qkVar2 = qkVar3;
                        size = size;
                        qi6Var = qi6Var4;
                        z9 = false;
                        os0Var2 = os0Var;
                    }
                    p44Var = p44Var2;
                    qi6Var2 = qi6Var;
                    qkVar = qkVar2;
                    ub2Var4 = ub2Var;
                    kd2Var.q(z9);
                } else {
                    kd2Var.e0(-297322234);
                    kd2Var.q(false);
                    p44Var = p44Var2;
                    qi6Var2 = qi6Var;
                    qkVar = qkVar2;
                    ub2Var4 = ub2Var;
                }
                boolean f4 = kd2Var.f(xi6Var.f()) | kd2Var.f(qkVar) | kd2Var.f(ti4Var.getValue());
                Object Q6 = kd2Var.Q();
                if (f4 || Q6 == obj2) {
                    Q6 = (ez0) ub2Var4.invoke(qkVar);
                    kd2Var.n0(Q6);
                }
                ez0 ez0Var = (ez0) Q6;
                xi6 xi6Var2 = qkVar.a;
                boolean f5 = kd2Var.f(qkVar);
                Object Q7 = kd2Var.Q();
                if (f5 || Q7 == obj2) {
                    Q7 = xt5.g(Boolean.FALSE);
                    kd2Var.n0(Q7);
                }
                w44 w44Var = (w44) Q7;
                w44 h = xt5.h(ez0Var.d, kd2Var);
                if (a34.i(xi6Var2.a.v(), xi6Var2.d.getValue())) {
                    w44Var.setValue(Boolean.FALSE);
                } else if (h.getValue() != null) {
                    w44Var.setValue(Boolean.TRUE);
                }
                boolean booleanValue = ((Boolean) w44Var.getValue()).booleanValue();
                yz3 yz3Var2 = vz3.x;
                if (booleanValue) {
                    kd2Var.e0(1353077497);
                    zt5Var = zt5Var2;
                    kd2Var2 = kd2Var;
                    qi6Var3 = tl7.p(qkVar.a, db.s, null, kd2Var2, 0, 2);
                    boolean f6 = kd2Var2.f(qi6Var3);
                    Object Q8 = kd2Var2.Q();
                    if (f6 || Q8 == obj2) {
                        Q8 = n03.l(yz3Var2);
                        kd2Var2.n0(Q8);
                    }
                    yz3Var2 = (yz3) Q8;
                    kd2Var2.q(false);
                } else {
                    kd2Var2 = kd2Var;
                    zt5Var = zt5Var2;
                    kd2Var2.e0(1353343539);
                    kd2Var2.q(false);
                    qi6Var3 = qi6Var2;
                }
                yz3 w = yz3Var.w(yz3Var2.w(new mk(qi6Var3, h, qkVar)));
                Object Q9 = kd2Var2.Q();
                if (Q9 == obj2) {
                    Q9 = new ik(qkVar);
                    kd2Var2.n0(Q9);
                }
                ik ikVar = (ik) Q9;
                int hashCode = Long.hashCode(kd2Var2.T);
                al4 l = kd2Var2.l();
                yz3 E2 = o80.E(kd2Var2, w);
                tt0.d.getClass();
                kd2Var2.h0();
                if (kd2Var2.S) {
                    kd2Var2.k(za3.p0);
                } else {
                    kd2Var2.q0();
                }
                ss5.i(p7.F, kd2Var2, ikVar);
                ss5.i(p7.E, kd2Var2, l);
                ss5.e(kd2Var2, Integer.valueOf(hashCode));
                ss5.h(kd2Var2);
                ss5.i(p7.D, kd2Var2, E2);
                kd2Var2.e0(758586195);
                int size2 = zt5Var.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    Object obj4 = zt5Var.get(i17);
                    kd2Var2.c0(1420119555, ub2Var2.invoke(obj4));
                    ic2 ic2Var = (ic2) p44Var.g(obj4);
                    if (ic2Var == null) {
                        kd2Var2.e0(1074069702);
                        z7 = false;
                    } else {
                        z7 = false;
                        kd2Var2.e0(1420120731);
                        ic2Var.invoke(kd2Var2, 0);
                    }
                    kd2Var2.q(z7);
                    kd2Var2.q(z7);
                }
                kd2Var2.q(false);
                kd2Var2.q(true);
            } else {
                ov3.d();
                return;
            }
        } else {
            ub2Var4 = ub2Var;
            kd2Var2 = kd2Var;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ak(xi6Var, yz3Var, ub2Var4, e7Var, ub2Var2, ub2Var3, os0Var, i);
        }
    }

    public static final yd1 f(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        l92 a = m92.a(f);
        if (a == null) {
            a = new nh3(f);
        }
        return new yd1(f2, f, a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final java.util.List r18, final long r19, defpackage.yz3 r21, defpackage.th4 r22, defpackage.kd2 r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb4.g(java.util.List, long, yz3, th4, kd2, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(Info info, boolean z2, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z3;
        byte b;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        byte b2;
        boolean z4;
        boolean z5;
        byte b3;
        float f;
        boolean z6;
        String valueOf;
        String label;
        kd2 kd2Var2 = kd2Var;
        ys0 ys0Var = p7.D;
        st0 st0Var = p7.G;
        ys0 ys0Var2 = p7.E;
        st0 st0Var2 = p7.F;
        ao2 ao2Var = io3.h;
        x50 x50Var = pk2.H;
        kd2Var2.f0(1168163224);
        if (kd2Var2.h(info)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (kd2Var2.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var2.V(i5 & 1, z3)) {
            String f2 = lz5.f(R.string.status, kd2Var2);
            MediaStatus status = info.getStatus();
            if (status == null || (str = status.getLabel()) == null) {
                str = "N/A";
            }
            ai4 ai4Var = new ai4(f2, str);
            String f3 = lz5.f(R.string.type, kd2Var2);
            MediaFormat format = info.getFormat();
            if (format == null || (label = format.getLabel()) == null) {
                str2 = "N/A";
            } else {
                str2 = label;
            }
            ai4 ai4Var2 = new ai4(f3, str2);
            String f4 = lz5.f(R.string.year, kd2Var2);
            Integer seasonYear = info.getSeasonYear();
            if (seasonYear == null || (valueOf = String.valueOf(seasonYear.intValue())) == null) {
                str3 = "N/A";
            } else {
                str3 = valueOf;
            }
            List<ai4> I2 = te4.I(ai4Var, ai4Var2, new ai4(f4, str3));
            String f5 = lz5.f(R.string.start_date, kd2Var2);
            String startDate = info.getStartDate();
            if (startDate == null) {
                startDate = "N/A";
            }
            te1 te1Var = new te1(R.drawable.timer, f5, startDate);
            String f6 = lz5.f(R.string.end_date, kd2Var2);
            String endDate = info.getEndDate();
            if (endDate == null) {
                str4 = "N/A";
            } else {
                str4 = endDate;
            }
            te1 te1Var2 = new te1(R.drawable.timer, f6, str4);
            String f7 = lz5.f(R.string.country, kd2Var2);
            String country = info.getCountry();
            if (country == null) {
                country = "N/A";
            }
            te1 te1Var3 = new te1(R.drawable.globe, f7, country);
            String f8 = lz5.f(R.string.season, kd2Var2);
            MediaSeason season = info.getSeason();
            if (season == null || (str5 = season.getLabel()) == null) {
                str5 = "N/A";
            }
            te1 te1Var4 = new te1(R.drawable.season, f8, str5);
            String f9 = lz5.f(R.string.source, kd2Var2);
            MediaSource source = info.getSource();
            if (source == null || (str6 = source.getLabel()) == null) {
                str6 = "N/A";
            }
            List I3 = te4.I(te1Var, te1Var2, te1Var3, te1Var4, new te1(R.drawable.book, f9, str6));
            long currentTimeMillis = System.currentTimeMillis();
            tq1 tq1Var = op0.a;
            long b4 = ep0.b(0.8f, ((mp0) kd2Var2.j(tq1Var)).o);
            vz3 vz3Var = vz3.x;
            t53 t53Var = za3.p0;
            if (z2) {
                kd2Var2.e0(-1367935713);
                yz3 c = ar5.c(n77.S(bx7.h(vz3Var, ((mp0) kd2Var2.j(tq1Var)).n, ao2Var), 10.0f, 15.0f), 1.0f);
                z75 a = y75.a(new vr(20.0f, true, new ze0((byte) 6)), x50Var, kd2Var2, 54);
                int hashCode = Long.hashCode(kd2Var2.T);
                al4 l = kd2Var2.l();
                yz3 E2 = o80.E(kd2Var2, c);
                tt0.d.getClass();
                kd2Var2.h0();
                if (kd2Var2.S) {
                    kd2Var2.k(t53Var);
                } else {
                    kd2Var2.q0();
                }
                ss5.i(st0Var2, kd2Var2, a);
                ss5.i(ys0Var2, kd2Var2, l);
                h11.q(hashCode, kd2Var2, st0Var, kd2Var2);
                ss5.i(ys0Var, kd2Var2, E2);
                b85 b85Var = b85.a;
                yz3 a2 = b85Var.a(1.0f, true);
                xp0 a3 = vp0.a(new vr(15.0f, true, new ze0((byte) 6)), pk2.K, kd2Var2, 6);
                int hashCode2 = Long.hashCode(kd2Var2.T);
                al4 l2 = kd2Var2.l();
                yz3 E3 = o80.E(kd2Var2, a2);
                kd2Var2.h0();
                if (kd2Var2.S) {
                    kd2Var2.k(t53Var);
                } else {
                    kd2Var2.q0();
                }
                ss5.i(st0Var2, kd2Var2, a3);
                ss5.i(ys0Var2, kd2Var2, l2);
                h11.q(hashCode2, kd2Var2, st0Var, kd2Var2);
                ss5.i(ys0Var, kd2Var2, E3);
                yz3 c2 = ar5.c(vz3Var, 1.0f);
                z75 a4 = y75.a(new vr(10.0f, true, new ze0((byte) 6)), x50Var, kd2Var2, 6);
                int hashCode3 = Long.hashCode(kd2Var2.T);
                al4 l3 = kd2Var2.l();
                yz3 E4 = o80.E(kd2Var2, c2);
                kd2Var2.h0();
                if (kd2Var2.S) {
                    kd2Var2.k(t53Var);
                } else {
                    kd2Var2.q0();
                }
                ss5.i(st0Var2, kd2Var2, a4);
                ss5.i(ys0Var2, kd2Var2, l3);
                h11.q(hashCode3, kd2Var2, st0Var, kd2Var2);
                ss5.i(ys0Var, kd2Var2, E4);
                kd2Var2.e0(144720008);
                for (ai4 ai4Var3 : I2) {
                    m((String) ai4Var3.y, (String) ai4Var3.x, b4, b85Var.a(1.0f, true), kd2Var2, 0);
                }
                boolean z7 = false;
                byte b5 = 1;
                kd2Var2.q(false);
                kd2Var2.q(true);
                NextAiringEpisode nextAiringEpisode = info.getNextAiringEpisode();
                if (nextAiringEpisode == null) {
                    kd2Var2.e0(-1610414537);
                    kd2Var2.q(false);
                    b3 = 6;
                    z5 = true;
                    f = 6.0f;
                } else {
                    kd2Var2.e0(-1610414536);
                    yz3 c3 = ar5.c(vz3Var, 1.0f);
                    os0 R = nx7.R(796880214, new je1(nextAiringEpisode, currentTimeMillis, b5), kd2Var2);
                    z5 = true;
                    b3 = 6;
                    f = 6.0f;
                    wk6.b(c3, null, 0L, 0L, null, R, kd2Var, 196614, 30);
                    kd2Var2 = kd2Var;
                    z7 = false;
                    kd2Var2.q(false);
                }
                List<String> genres = info.getGenres();
                if (genres == null) {
                    kd2Var2.e0(-1608174694);
                    kd2Var2.q(z7);
                    z6 = z7;
                } else {
                    kd2Var2.e0(-1608174693);
                    q23.b(null, new vr(f, z5, new ze0(b3)), new vr(f, z5, new ze0(b3)), null, 0, 0, nx7.R(-1803191646, new ke1(genres, (byte) 2), kd2Var2), kd2Var, 1573296, 57);
                    kd2Var2 = kd2Var;
                    z6 = false;
                    kd2Var2.q(false);
                }
                kd2Var2.q(z5);
                g(I3, b4, b85Var.a(1.2f, z5), new vh4(10.0f, 10.0f, 10.0f, 10.0f), kd2Var2, 3072, 0);
                kd2Var2.q(z5);
                kd2Var2.q(z6);
                b = z5;
            } else {
                kd2Var2.e0(-1363649405);
                yz3 S = n77.S(bx7.h(vz3Var, ((mp0) kd2Var2.j(tq1Var)).n, ao2Var), 10.0f, 15.0f);
                xp0 a5 = vp0.a(new vr(15.0f, true, new ze0((byte) 6)), pk2.L, kd2Var2, 54);
                int hashCode4 = Long.hashCode(kd2Var2.T);
                al4 l4 = kd2Var2.l();
                yz3 E5 = o80.E(kd2Var2, S);
                tt0.d.getClass();
                kd2Var2.h0();
                if (kd2Var2.S) {
                    kd2Var2.k(t53Var);
                } else {
                    kd2Var2.q0();
                }
                ss5.i(st0Var2, kd2Var2, a5);
                ss5.i(ys0Var2, kd2Var2, l4);
                h11.q(hashCode4, kd2Var2, st0Var, kd2Var2);
                ss5.i(ys0Var, kd2Var2, E5);
                yz3 c4 = ar5.c(vz3Var, 1.0f);
                z75 a6 = y75.a(new vr(8.0f, true, new ze0((byte) 6)), x50Var, kd2Var2, 6);
                int hashCode5 = Long.hashCode(kd2Var2.T);
                al4 l5 = kd2Var2.l();
                yz3 E6 = o80.E(kd2Var2, c4);
                kd2Var2.h0();
                if (kd2Var2.S) {
                    kd2Var2.k(t53Var);
                } else {
                    kd2Var2.q0();
                }
                ss5.i(st0Var2, kd2Var2, a6);
                ss5.i(ys0Var2, kd2Var2, l5);
                h11.q(hashCode5, kd2Var2, st0Var, kd2Var2);
                ss5.i(ys0Var, kd2Var2, E6);
                kd2Var2.e0(-2142312345);
                for (ai4 ai4Var4 : I2) {
                    m((String) ai4Var4.y, (String) ai4Var4.x, b4, new ob3(1.0f, true), kd2Var2, 0);
                }
                boolean z8 = false;
                kd2Var2.q(false);
                kd2Var2.q(true);
                NextAiringEpisode nextAiringEpisode2 = info.getNextAiringEpisode();
                if (nextAiringEpisode2 == null) {
                    kd2Var2.e0(-1843352482);
                    kd2Var2.q(false);
                    b2 = 6;
                } else {
                    kd2Var2.e0(-1843352481);
                    yz3 c5 = ar5.c(vz3Var, 1.0f);
                    os0 R2 = nx7.R(-1568611695, new je1(nextAiringEpisode2, currentTimeMillis, (byte) 2), kd2Var2);
                    b2 = 6;
                    wk6.b(c5, null, 0L, 0L, null, R2, kd2Var, 196614, 30);
                    kd2Var2 = kd2Var;
                    z8 = false;
                    kd2Var2.q(false);
                }
                List<String> genres2 = info.getGenres();
                if (genres2 == null) {
                    kd2Var2.e0(-1841210661);
                    kd2Var2.q(z8);
                    z4 = z8;
                } else {
                    kd2Var2.e0(-1841210660);
                    q23.b(ar5.c(vz3Var, 1.0f), new vr(6.0f, true, new ze0(b2)), new vr(6.0f, true, new ze0(b2)), null, 0, 0, nx7.R(1988835293, new ke1(genres2, (byte) 3), kd2Var2), kd2Var, 1573302, 56);
                    kd2Var2 = kd2Var;
                    z4 = false;
                    kd2Var2.q(false);
                }
                g(I3, b4, null, null, kd2Var2, 0, 12);
                b = 1;
                kd2Var2.q(true);
                kd2Var2.q(z4);
            }
        } else {
            b = 1;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new q01(info, z2, i, b);
        }
    }

    public static final void j(ko4 ko4Var, ub2 ub2Var, kd2 kd2Var, int i) {
        boolean z2;
        Object[] objArr = {ko4Var};
        if ((((i & 112) ^ 48) > 32 && kd2Var.f(ub2Var)) || (i & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object Q = kd2Var.Q();
        if (z2 || Q == au0.a) {
            Q = new o(ub2Var, (byte) 6);
            kd2Var.n0(Q);
        }
        v94.K(new i55(Arrays.copyOf(objArr, 1), kd2Var.T, j55.class.getName().hashCode()), (sb2) Q, kd2Var, 0);
    }

    public static final void k(final yz3 yz3Var, ic2 ic2Var, ic2 ic2Var2, ic2 ic2Var3, ic2 ic2Var4, int i, final long j, long j2, t47 t47Var, final os0 os0Var, kd2 kd2Var, final int i2) {
        int i3;
        boolean z2;
        final ic2 ic2Var5;
        final ic2 ic2Var6;
        final ic2 ic2Var7;
        final ic2 ic2Var8;
        final int i4;
        final long j3;
        final t47 t47Var2;
        t47 mn6Var;
        int i5;
        ic2 ic2Var9;
        int i6;
        ic2 ic2Var10;
        ic2 ic2Var11;
        ic2 ic2Var12;
        long j4;
        kd2Var.f0(-1211482744);
        int i7 = i2 | 224688;
        if (kd2Var.e(j)) {
            i3 = 1048576;
        } else {
            i3 = 524288;
        }
        int i8 = i7 | i3 | 37748736;
        if ((306783379 & i8) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i8 & 1, z2)) {
            kd2Var.a0();
            if ((i2 & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i5 = i8 & (-264241153);
                ic2Var9 = ic2Var;
                ic2Var10 = ic2Var2;
                ic2Var11 = ic2Var3;
                ic2Var12 = ic2Var4;
                i6 = i;
                j4 = j2;
                mn6Var = t47Var;
            } else {
                os0 os0Var2 = xs0.a;
                os0 os0Var3 = xs0.b;
                os0 os0Var4 = xs0.c;
                os0 os0Var5 = xs0.d;
                long a = op0.a(j, kd2Var);
                WeakHashMap weakHashMap = z57.w;
                mn6Var = new mn6(mv5.b(kd2Var).g, mv5.b(kd2Var).b);
                i5 = i8 & (-264241153);
                ic2Var9 = os0Var2;
                i6 = 2;
                ic2Var10 = os0Var3;
                ic2Var11 = os0Var4;
                ic2Var12 = os0Var5;
                j4 = a;
            }
            kd2Var.r();
            boolean f = kd2Var.f(mn6Var);
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (f || Q == obj) {
                Q = new b54(mn6Var);
                kd2Var.n0(Q);
            }
            b54 b54Var = (b54) Q;
            boolean f2 = kd2Var.f(b54Var) | kd2Var.f(mn6Var);
            Object Q2 = kd2Var.Q();
            if (f2 || Q2 == obj) {
                Q2 = new r82(b54Var, mn6Var, (byte) 27);
                kd2Var.n0(Q2);
            }
            l36.a(h41.M(yz3Var, (ub2) Q2), null, j, j4, 0.0f, 0.0f, null, nx7.R(848889571, new ta5(i6, ic2Var9, os0Var, ic2Var11, ic2Var12, b54Var, ic2Var10), kd2Var), kd2Var, ((i5 >> 12) & 896) | 12582912, 114);
            j3 = j4;
            t47Var2 = mn6Var;
            i4 = i6;
            ic2Var5 = ic2Var9;
            ic2Var7 = ic2Var11;
            ic2Var8 = ic2Var12;
            ic2Var6 = ic2Var10;
        } else {
            kd2Var.Y();
            ic2Var5 = ic2Var;
            ic2Var6 = ic2Var2;
            ic2Var7 = ic2Var3;
            ic2Var8 = ic2Var4;
            i4 = i;
            j3 = j2;
            t47Var2 = t47Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(ic2Var5, ic2Var6, ic2Var7, ic2Var8, i4, j, j3, t47Var2, os0Var, i2) { // from class: pa5
                public final /* synthetic */ ic2 A;
                public final /* synthetic */ ic2 B;
                public final /* synthetic */ byte C;
                public final /* synthetic */ long D;
                public final /* synthetic */ long E;
                public final /* synthetic */ t47 F;
                public final /* synthetic */ os0 G;
                public final /* synthetic */ ic2 y;
                public final /* synthetic */ ic2 z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int N2 = kb0.N(805306375);
                    bb4.k(yz3.this, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (kd2) obj2, N2);
                    return pn6.a;
                }
            };
        }
    }

    public static final void l(final int i, final ic2 ic2Var, final os0 os0Var, final ic2 ic2Var2, final ic2 ic2Var3, final t47 t47Var, final ic2 ic2Var4, kd2 kd2Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i10;
        boolean z7;
        boolean z8;
        boolean z9;
        int i11;
        int i12;
        kd2Var.f0(-280287501);
        if (kd2Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i2 | i3;
        if (kd2Var.h(ic2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        if (kd2Var.h(os0Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i15 = i14 | i5;
        if (kd2Var.h(ic2Var2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i16 = i15 | i6;
        if (kd2Var.h(ic2Var3)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i17 = i16 | i7;
        if (kd2Var.f(t47Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i18 = i17 | i8;
        if (kd2Var.h(ic2Var4)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i19 = i18 | i9;
        byte b = 1;
        if ((599187 & i19) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i19 & 1, z2)) {
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (Q == obj) {
                Q = new va5();
                kd2Var.n0(Q);
            }
            final va5 va5Var = (va5) Q;
            if ((i19 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object Q2 = kd2Var.Q();
            byte b2 = 3;
            if (z3 || Q2 == obj) {
                Q2 = new os0(605195056, true, new ua5(ic2Var, b2));
                kd2Var.n0(Q2);
            }
            final ic2 ic2Var5 = (ic2) Q2;
            if ((i19 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object Q3 = kd2Var.Q();
            if (z4 || Q3 == obj) {
                Q3 = new os0(418899191, true, new ua5(ic2Var2, (byte) 2));
                kd2Var.n0(Q3);
            }
            final ic2 ic2Var6 = (ic2) Q3;
            if ((57344 & i19) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object Q4 = kd2Var.Q();
            if (z5 || Q4 == obj) {
                Q4 = new os0(338600263, true, new ua5(ic2Var3, b));
                kd2Var.n0(Q4);
            }
            final ic2 ic2Var7 = (ic2) Q4;
            if ((i19 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object Q5 = kd2Var.Q();
            if (!z6 && Q5 != obj) {
                i10 = i19;
            } else {
                i10 = i19;
                Q5 = new os0(-1776388365, true, new d50(os0Var, (Object) va5Var, (byte) 3));
                kd2Var.n0(Q5);
            }
            final ic2 ic2Var8 = (ic2) Q5;
            if ((i10 & 3670016) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            Object Q6 = kd2Var.Q();
            if (z7 || Q6 == obj) {
                Q6 = new os0(-1731662488, true, new ua5(ic2Var4, (byte) 0));
                kd2Var.n0(Q6);
            }
            final ic2 ic2Var9 = (ic2) Q6;
            if ((i10 & 458752) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean f = z8 | kd2Var.f(ic2Var5) | kd2Var.f(ic2Var6) | kd2Var.f(ic2Var7);
            if ((i10 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean f2 = f | z9 | kd2Var.f(ic2Var9) | kd2Var.f(ic2Var8);
            Object Q7 = kd2Var.Q();
            if (!f2 && Q7 != obj) {
                i11 = 1;
                i12 = 0;
            } else {
                i11 = 1;
                i12 = 0;
                Object obj2 = new ic2() { // from class: qa5
                    @Override // defpackage.ic2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i20;
                        int x0;
                        int x02;
                        h12 h12Var;
                        boolean z10;
                        boolean z11;
                        h12 h12Var2;
                        final Integer num;
                        int i21;
                        float T;
                        float T2;
                        float T3;
                        float T4;
                        int c;
                        int x03;
                        int c2;
                        final x06 x06Var = (x06) obj3;
                        rx0 rx0Var = (rx0) obj4;
                        final int h = rx0.h(rx0Var.a);
                        final int g = rx0.g(rx0Var.a);
                        long a = rx0.a(rx0Var.a, 0, 0, 0, 0, 10);
                        ia3 layoutDirection = x06Var.getLayoutDirection();
                        final t47 t47Var2 = t47.this;
                        int d = t47Var2.d(x06Var, layoutDirection);
                        int b3 = t47Var2.b(x06Var, x06Var.getLayoutDirection());
                        int c3 = t47Var2.c(x06Var);
                        final em4 p = ((ro3) yo0.k0(x06Var.H(wa5.x, ic2Var5))).p(a);
                        int i22 = (-d) - b3;
                        int i23 = -c3;
                        final em4 p2 = ((ro3) yo0.k0(x06Var.H(wa5.z, ic2Var6))).p(sx0.i(i22, a, i23));
                        final em4 p3 = ((ro3) yo0.k0(x06Var.H(wa5.A, ic2Var7))).p(sx0.i(i22, a, i23));
                        int i24 = p3.x;
                        ia3 ia3Var = ia3.x;
                        byte b4 = i;
                        Integer num2 = null;
                        if (i24 == 0 && p3.y == 0) {
                            h12Var = null;
                            z10 = false;
                        } else {
                            int i25 = p3.y;
                            if (b4 == 0) {
                                i20 = d;
                                if (x06Var.getLayoutDirection() == ia3Var) {
                                    x0 = x06Var.x0(16.0f);
                                    x02 = x0 + i20;
                                    z10 = false;
                                    h12Var = new h12(x02, i25, (byte) 0);
                                } else {
                                    x02 = ((h - x06Var.x0(16.0f)) - i24) - b3;
                                    z10 = false;
                                    h12Var = new h12(x02, i25, (byte) 0);
                                }
                            } else {
                                i20 = d;
                                if (b4 == 2 || b4 == 3) {
                                    if (x06Var.getLayoutDirection() == ia3Var) {
                                        x02 = ((h - x06Var.x0(16.0f)) - i24) - b3;
                                    } else {
                                        x0 = x06Var.x0(16.0f);
                                        x02 = x0 + i20;
                                    }
                                } else {
                                    x02 = (((h - i24) + i20) - b3) / 2;
                                }
                                z10 = false;
                                h12Var = new h12(x02, i25, (byte) 0);
                            }
                        }
                        final em4 p4 = ((ro3) yo0.k0(x06Var.H(wa5.B, ic2Var9))).p(a);
                        if (p4.x == 0 && p4.y == 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (h12Var != null) {
                            int i26 = h12Var.c;
                            h12Var2 = h12Var;
                            if (!z11 && b4 != 3) {
                                x03 = p4.y + i26;
                                c2 = x06Var.x0(16.0f);
                            } else {
                                x03 = x06Var.x0(16.0f) + i26;
                                c2 = t47Var2.c(x06Var);
                            }
                            num = Integer.valueOf(c2 + x03);
                        } else {
                            h12Var2 = h12Var;
                            num = null;
                        }
                        int i27 = p2.y;
                        if (i27 != 0) {
                            if (num != null) {
                                c = num.intValue();
                            } else {
                                Integer valueOf = Integer.valueOf(p4.y);
                                if (!z11) {
                                    num2 = valueOf;
                                }
                                if (num2 != null) {
                                    c = num2.intValue();
                                } else {
                                    c = t47Var2.c(x06Var);
                                }
                            }
                            i21 = i27 + c;
                        } else {
                            i21 = 0;
                        }
                        if (p.x == 0 && p.y == 0) {
                            T = x06Var.T(t47Var2.a(x06Var));
                        } else {
                            T = x06Var.T(p.y);
                        }
                        if (z11) {
                            T2 = x06Var.T(t47Var2.c(x06Var));
                        } else {
                            T2 = x06Var.T(p4.y);
                        }
                        final int i28 = i21;
                        ia3 layoutDirection2 = x06Var.getLayoutDirection();
                        if (layoutDirection2 == ia3Var) {
                            T3 = x06Var.T(t47Var2.d(x06Var, layoutDirection2));
                        } else {
                            T3 = x06Var.T(t47Var2.b(x06Var, layoutDirection2));
                        }
                        ia3 layoutDirection3 = x06Var.getLayoutDirection();
                        if (layoutDirection3 == ia3Var) {
                            T4 = x06Var.T(t47Var2.b(x06Var, layoutDirection3));
                        } else {
                            T4 = x06Var.T(t47Var2.d(x06Var, layoutDirection3));
                        }
                        va5Var.a.setValue(new vh4(T3, T, T4, T2));
                        final em4 p5 = ((ro3) yo0.k0(x06Var.H(wa5.y, ic2Var8))).p(a);
                        final h12 h12Var3 = h12Var2;
                        return x06Var.L(h, g, ot1.x, new ub2() { // from class: sa5
                            @Override // defpackage.ub2
                            public final Object invoke(Object obj5) {
                                dm4 dm4Var = (dm4) obj5;
                                dm4Var.f(em4.this, 0, 0, 0.0f);
                                dm4Var.f(p, 0, 0, 0.0f);
                                em4 em4Var = p2;
                                int i29 = h - em4Var.x;
                                x06 x06Var2 = x06Var;
                                ia3 layoutDirection4 = x06Var2.getLayoutDirection();
                                t47 t47Var3 = t47Var2;
                                int d2 = ((t47Var3.d(x06Var2, layoutDirection4) + i29) - t47Var3.b(x06Var2, x06Var2.getLayoutDirection())) / 2;
                                int i30 = g;
                                dm4Var.f(em4Var, d2, i30 - i28, 0.0f);
                                em4 em4Var2 = p4;
                                dm4Var.f(em4Var2, 0, i30 - em4Var2.y, 0.0f);
                                h12 h12Var4 = h12Var3;
                                if (h12Var4 != null) {
                                    int i31 = h12Var4.b;
                                    Integer num3 = num;
                                    num3.getClass();
                                    dm4Var.f(p3, i31, i30 - num3.intValue(), 0.0f);
                                }
                                return pn6.a;
                            }
                        });
                    }
                };
                kd2Var.n0(obj2);
                Q7 = obj2;
            }
            te4.l(null, (ic2) Q7, kd2Var, i12, i11);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(i, ic2Var, os0Var, ic2Var2, ic2Var3, t47Var, ic2Var4, i2) { // from class: ra5
                public final /* synthetic */ ic2 A;
                public final /* synthetic */ ic2 B;
                public final /* synthetic */ t47 C;
                public final /* synthetic */ ic2 D;
                public final /* synthetic */ byte x;
                public final /* synthetic */ ic2 y;
                public final /* synthetic */ os0 z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int N2 = kb0.N(1);
                    bb4.l(this.x, this.y, this.z, this.A, this.B, this.C, this.D, (kd2) obj3, N2);
                    return pn6.a;
                }
            };
        }
    }

    public static final void m(String str, String str2, long j, yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        kd2Var.f0(794937380);
        if (kd2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (kd2Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (kd2Var.e(j)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (kd2Var.f(yz3Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i9 & 1, z2)) {
            wk6.b(yz3Var, null, 0L, 0L, null, nx7.R(1832571270, new ie1(str, str2, j, (byte) 1), kd2Var), kd2Var, ((i9 >> 9) & 14) | 196608, 30);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ol1(str, str2, j, yz3Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int n(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb4.n(int, int, int, boolean):int");
    }

    public static String o(OfflineDownloadMetadata offlineDownloadMetadata) {
        offlineDownloadMetadata.getClass();
        String N2 = N(offlineDownloadMetadata.getAnimeTitle());
        if (uz5.V(N2)) {
            return zo5.l("Anime ", offlineDownloadMetadata.getAnimeId());
        }
        return N2;
    }

    public static String p(OfflineDownloadMetadata offlineDownloadMetadata) {
        String audioTrackLabel = OfflineDownloadMetadataKt.getAudioTrackLabel(offlineDownloadMetadata);
        String obj = uz5.w0(uz5.u0(150, N(offlineDownloadMetadata.getAnimeTitle() + " - Episode " + offlineDownloadMetadata.getEpisodeNumber() + " - " + audioTrackLabel + " - " + offlineDownloadMetadata.getQuality()))).toString();
        if (uz5.V(obj)) {
            return "Anime " + offlineDownloadMetadata.getAnimeId() + " - Episode " + offlineDownloadMetadata.getEpisodeNumber();
        }
        return obj;
    }

    public static final void q(l77 l77Var, String str) {
        v87 b;
        boolean z2;
        WorkDatabase workDatabase = l77Var.c;
        workDatabase.getClass();
        a87 workSpecDao = workDatabase.workSpecDao();
        ce1 dependencyDao = workDatabase.dependencyDao();
        ArrayList J2 = te4.J(str);
        J2.addAll(bx7.v(dependencyDao, str));
        ArrayList arrayList = new ArrayList();
        int size = J2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = J2.get(i2);
            i2++;
            j77 state = workSpecDao.getState((String) obj);
            if (state != null) {
                z2 = true ^ state.a();
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj);
            }
        }
        a87 workSpecDao2 = l77Var.c.workSpecDao();
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            workSpecDao2.setCancelledState((String) obj2);
        }
        pu4 pu4Var = l77Var.f;
        pu4Var.getClass();
        synchronized (pu4Var.k) {
            xk3.d().a(pu4.l, "Processor cancelling " + str);
            pu4Var.i.add(str);
            b = pu4Var.b(str);
        }
        pu4.d(str, b, 1);
        Iterator it = l77Var.e.iterator();
        while (it.hasNext()) {
            ((tb5) it.next()).d(str);
        }
        l77Var.b.getClass();
    }

    public static void r(Object obj, String str) {
        if (obj != null) {
            return;
        }
        qi2.m(str);
    }

    public static void s(String str, boolean z2) {
        if (z2) {
            return;
        }
        ze0.m(str);
    }

    public static kr0 t(String str, String str2) {
        cy cyVar = new cy(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(px4.a(cy.class));
        return new kr0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new ir0(cyVar, (byte) 0), hashSet3);
    }

    public static final String u(Object obj) {
        return obj + ":" + z05.a(obj.getClass());
    }

    public static boolean v(Set set, Object obj) {
        if (set != obj) {
            if (obj instanceof Set) {
                Set set2 = (Set) obj;
                try {
                    if (set.size() == set2.size()) {
                        if (set.containsAll(set2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static bl5 x(Set set, gs4 gs4Var) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (collection instanceof bl5) {
                bl5 bl5Var = (bl5) collection;
                return new bl5((SortedSet) bl5Var.x, new hs4(Arrays.asList(bl5Var.y, gs4Var)));
            }
            return new bl5(collection, gs4Var);
        }
        if (set instanceof bl5) {
            bl5 bl5Var2 = (bl5) set;
            return new bl5((Set) bl5Var2.x, new hs4(Arrays.asList(bl5Var2.y, gs4Var)));
        }
        set.getClass();
        return new bl5(set, gs4Var);
    }

    public static final h82 y(h82 h82Var) {
        h82 g = ((r72) ((oa) wc7.P(h82Var)).getFocusOwner()).g();
        if (g != null && g.K) {
            return g;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x005f, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0078, code lost:
    
        if (r8 == 1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.o15 z(java.nio.ByteBuffer r11) {
        /*
            int r0 = r11.remaining()
            if (r0 != 0) goto Lb
            z62 r11 = defpackage.nw2.y
            o15 r11 = defpackage.o15.B
            return r11
        Lb:
            java.nio.ByteBuffer r11 = r11.asReadOnlyBuffer()
            int r0 = r11.position()
            int r0 = P(r0, r11)
            int r0 = r0 + 3
            java.lang.String r1 = "initialCapacity"
            r2 = 4
            defpackage.io3.t(r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r3 = 0
            r4 = 1
            r5 = r1
            r7 = r3
            r6 = r4
            r1 = r0
        L27:
            int r8 = r11.limit()
            if (r0 >= r8) goto Lb7
            if (r6 == 0) goto La7
        L2f:
            int r6 = r11.limit()
            int r6 = r6 - r2
            if (r0 > r6) goto L62
            int r6 = r11.getInt(r0)
            r8 = r6 & (-256(0xffffffffffffff00, float:NaN))
            if (r8 == 0) goto L7f
            r9 = 256(0x100, float:3.59E-43)
            if (r8 != r9) goto L43
            goto L7f
        L43:
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r8 = r8 & r6
            if (r8 == 0) goto L5f
            if (r8 != r4) goto L4c
            goto L5f
        L4c:
            r8 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r6
            if (r8 != 0) goto L55
            int r0 = r0 + 2
            goto L2f
        L55:
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 != 0) goto L5c
            int r0 = r0 + 3
            goto L2f
        L5c:
            int r0 = r0 + 4
            goto L2f
        L5f:
            int r0 = r0 + 1
            goto L7f
        L62:
            int r6 = r11.limit()
            int r6 = r6 + (-3)
            if (r0 != r6) goto L7b
            short r6 = r11.getShort(r0)
            int r8 = r0 + 2
            byte r8 = r11.get(r8)
            if (r6 != 0) goto L7b
            if (r8 == 0) goto L7f
            if (r8 != r4) goto L7b
            goto L7f
        L7b:
            int r0 = r11.limit()
        L7f:
            int r6 = r0 - r1
            java.nio.ByteBuffer r8 = r11.duplicate()
            r8.position(r1)
            int r6 = r6 + r1
            r8.limit(r6)
            java.nio.ByteBuffer r6 = r8.slice()
            r6.getClass()
            int r8 = r5.length
            int r9 = r7 + 1
            int r8 = defpackage.fw2.b(r8, r9)
            int r10 = r5.length
            if (r8 > r10) goto L9e
            goto La2
        L9e:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r8)
        La2:
            r5[r7] = r6
            r6 = r3
            r7 = r9
            goto L27
        La7:
            int r0 = P(r0, r11)
            int r1 = r11.limit()
            if (r0 == r1) goto Lb7
            int r1 = r0 + 3
            r0 = r1
            r6 = r4
            goto L27
        Lb7:
            o15 r11 = defpackage.nw2.j(r5, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb4.z(java.nio.ByteBuffer):o15");
    }

    public abstract n05 D();
}
