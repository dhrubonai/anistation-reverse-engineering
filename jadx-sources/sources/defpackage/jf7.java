package defpackage;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import com.anistation.android.R;
import com.anistation.model.Page;
import com.anistation.model.SearchSuggestion;
import com.anistation.model.Status;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class jf7 implements ja5 {
    public static final rt x = new Object();
    public static final os0 y = new os0(-953594197, false, new qs0(4));
    public static final Class[] z = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final be A = new be(15);
    public static final StackTraceElement[] B = new StackTraceElement[0];
    public static final xb5 C = new xb5((byte) 6);

    public static final int A(nc3 nc3Var, rg4 rg4Var) {
        long j;
        if (rg4Var == rg4.x) {
            j = nc3Var.x & 4294967295L;
        } else {
            j = nc3Var.x >> 32;
        }
        return (int) j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(defpackage.pd r16, defpackage.gi6 r17, defpackage.dd6 r18, defpackage.yv2 r19, defpackage.ub2 r20, defpackage.sb2 r21, defpackage.rt3 r22, defpackage.t44 r23, defpackage.rv6 r24, defpackage.ub2 r25, defpackage.xz0 r26) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof defpackage.gf
            if (r1 == 0) goto L15
            r1 = r0
            gf r1 = (defpackage.gf) r1
            int r2 = r1.y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.y = r2
            goto L1a
        L15:
            gf r1 = new gf
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.x
            int r2 = r1.y
            r3 = 1
            if (r2 == 0) goto L2d
            if (r2 == r3) goto L29
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return
        L29:
            defpackage.m37.N(r0)
            goto L55
        L2d:
            defpackage.m37.N(r0)
            lf r4 = new lf
            r15 = 0
            r9 = r16
            r6 = r17
            r7 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r8 = r22
            r5 = r23
            r13 = r24
            r14 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.y = r3
            java.lang.Object r0 = defpackage.db.K(r4, r1)
            w11 r1 = defpackage.w11.x
            if (r0 != r1) goto L55
            return
        L55:
            defpackage.v71.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.B(pd, gi6, dd6, yv2, ub2, sb2, rt3, t44, rv6, ub2, xz0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(defpackage.pd r13, defpackage.gi6 r14, defpackage.dd6 r15, defpackage.yv2 r16, defpackage.ic5 r17, defpackage.z96 r18, defpackage.t44 r19, defpackage.rv6 r20, defpackage.aa6 r21, defpackage.xz0 r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof defpackage.ff
            if (r1 == 0) goto L16
            r1 = r0
            ff r1 = (defpackage.ff) r1
            int r2 = r1.y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.y = r2
        L14:
            r12 = r1
            goto L1c
        L16:
            ff r1 = new ff
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r12.x
            int r1 = r12.y
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L2b
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r13)
            return
        L2b:
            defpackage.m37.N(r0)
            defpackage.v71.e()
            return
        L32:
            defpackage.m37.N(r0)
            android.view.View r0 = r13.x
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            r4 = 9
            if (r1 < r3) goto L46
            ft0 r1 = new ft0
            r1.<init>(r0, r4)
        L44:
            r8 = r1
            goto L4c
        L46:
            rt3 r1 = new rt3
            r1.<init>(r0, r4)
            goto L44
        L4c:
            r12.y = r2
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            B(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.C(pd, gi6, dd6, yv2, ic5, z96, t44, rv6, aa6, xz0):void");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [zm3, jy3] */
    public static jy3 D(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    int i3 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i3) {
                        break;
                    }
                    i2++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j2 = duplicate.getInt() & 4294967295L;
                for (int i4 = 0; i4 < j2; i4++) {
                    int i5 = duplicate.getInt();
                    long j3 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i5 || 1701669481 == i5) {
                        duplicate.position((int) (j3 + j));
                        ?? zm3Var = new zm3();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        zm3Var.A = duplicate;
                        zm3Var.x = position;
                        int i6 = position - duplicate.getInt(position);
                        zm3Var.y = i6;
                        zm3Var.z = ((ByteBuffer) zm3Var.A).getShort(i6);
                        return zm3Var;
                    }
                }
            }
            qi2.k("Cannot read metadata.");
            return null;
        }
        qi2.k("Cannot read metadata.");
        return null;
    }

    public static final View E(yc1 yc1Var) {
        if (!((xz3) yc1Var).x.K) {
            ez2.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) cb3.a(wc7.O(yc1Var));
    }

    public static l33 F(Object obj) {
        de6 de6Var;
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        if (obj2 != null) {
            de6Var = (de6) de6.i.j(obj2);
        } else {
            de6Var = null;
        }
        obj3.getClass();
        return new l33(de6Var, (hn6) C.j(obj3));
    }

    public static int G(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static List H(i95 i95Var, l33 l33Var) {
        List list;
        de6 de6Var = (de6) ((ti4) l33Var.z).getValue();
        if (de6Var != null) {
            Integer valueOf = Integer.valueOf(de6Var.a);
            String str = de6Var.b;
            String str2 = de6Var.c;
            long j = de6Var.d;
            int i = nd6.c;
            Integer valueOf2 = Integer.valueOf((int) (j >> 32));
            Integer valueOf3 = Integer.valueOf((int) (j & 4294967295L));
            long j2 = de6Var.e;
            list = te4.I(valueOf, str, str2, valueOf2, valueOf3, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (4294967295L & j2)), Long.valueOf(de6Var.f));
        } else {
            list = null;
        }
        return te4.I(list, C.u(i95Var, (hn6) l33Var.y));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r6v2, types: [t05, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(defpackage.kd5 r4, float r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.nc5
            if (r0 == 0) goto L13
            r0 = r6
            nc5 r0 = (defpackage.nc5) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            nc5 r0 = new nc5
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.y
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            t05 r4 = r0.x
            defpackage.m37.N(r6)
            goto L4b
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2e:
            defpackage.m37.N(r6)
            t05 r6 = new t05
            r6.<init>()
            oc5 r1 = new oc5
            r1.<init>(r6, r5, r2)
            r0.x = r6
            r0.z = r3
            c54 r5 = defpackage.c54.x
            java.lang.Object r4 = r4.d(r5, r1, r0)
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L4a
            return r5
        L4a:
            r4 = r6
        L4b:
            float r4 = r4.x
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.I(kd5, float, xz0):java.lang.Object");
    }

    public static final int J(jg5 jg5Var, int i) {
        int i2;
        int[] iArr = jg5Var.C;
        int i3 = i + 1;
        int length = jg5Var.B.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = iArr[i2];
                if (i5 < i3) {
                    i4 = i2 + 1;
                } else {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static final void K(v65 v65Var) {
        if (!v65Var.getCloseBarrier$room_runtime().d.get()) {
            return;
        }
        ze0.m("Database is closed");
    }

    public static int[] L(Collection collection) {
        if (collection instanceof z23) {
            z23 z23Var = (z23) collection;
            return Arrays.copyOfRange(z23Var.x, z23Var.y, z23Var.z);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final void M(oa0 oa0Var, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        while (remaining > 0) {
            yf5 T = oa0Var.T(1);
            byte[] bArr = T.a;
            int i = T.c;
            int min = Math.min(remaining, bArr.length - i);
            byteBuffer.get(bArr, i, min);
            if (min == 1) {
                T.c += min;
                oa0Var.z += min;
            } else if (min >= 0 && min <= T.a()) {
                if (min != 0) {
                    T.c += min;
                    oa0Var.z += min;
                } else if (db.Z(T)) {
                    oa0Var.t();
                }
            } else {
                StringBuilder s = qx1.s(min, "Invalid number of bytes written: ", ". Should be in 0..");
                s.append(T.a());
                throw new IllegalStateException(s.toString().toString());
            }
            remaining -= min;
        }
    }

    public static Integer N(String str) {
        byte b;
        Long valueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = 0;
            if (str.charAt(0) == '-') {
                i = 1;
            }
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    b = tl3.a[charAt];
                } else {
                    byte[] bArr = tl3.a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt2 = str.charAt(i2);
                            if (charAt2 < 128) {
                                b2 = tl3.a[charAt2];
                            } else {
                                byte[] bArr2 = tl3.a;
                                b2 = -1;
                            }
                            if (b2 < 0 || b2 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = b2;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i2 = i3;
                        } else if (i != 0) {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O(android.view.inputmethod.EditorInfo r16, java.lang.CharSequence r17, long r18, defpackage.yv2 r20) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.O(android.view.inputmethod.EditorInfo, java.lang.CharSequence, long, yv2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ff7 P() {
        /*
            java.lang.String r0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            java.lang.Class<jf7> r1 = defpackage.jf7.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Class<ff7> r2 = defpackage.ff7.class
            boolean r3 = r2.equals(r2)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L13
            goto L2f
        L13:
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r1)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch: java.lang.ReflectiveOperationException -> L28
            java.lang.Object r0 = r0.newInstance(r5)     // Catch: java.lang.ReflectiveOperationException -> L28
            if (r0 != 0) goto L22
            throw r5
        L22:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.ReflectiveOperationException -> L28
            r0.<init>()     // Catch: java.lang.ReflectiveOperationException -> L28
            throw r0     // Catch: java.lang.ReflectiveOperationException -> L28
        L28:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L2f
            r1.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L2f
            throw r1     // Catch: java.lang.ClassNotFoundException -> L2f
        L2f:
            r1 = 0
            jf7[] r0 = new defpackage.jf7[r1]     // Catch: java.lang.Throwable -> La6
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> La6
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> La6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L3f:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L77
            int r0 = r6.size()
            if (r0 != r4) goto L52
            java.lang.Object r0 = r6.get(r1)
            ff7 r0 = (defpackage.ff7) r0
            return r0
        L52:
            int r0 = r6.size()
            if (r0 != 0) goto L59
            return r5
        L59:
            java.lang.String r0 = "combine"
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.reflect.Method r0 = r2.getMethod(r0, r1)     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.Object[] r1 = new java.lang.Object[]{r6}     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.Object r0 = r0.invoke(r5, r1)     // Catch: java.lang.ReflectiveOperationException -> L70
            ff7 r0 = (defpackage.ff7) r0     // Catch: java.lang.ReflectiveOperationException -> L70
            return r0
        L70:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L77:
            java.lang.Object r0 = r3.next()     // Catch: java.util.ServiceConfigurationError -> L86
            if (r0 != 0) goto L7e
            throw r5
        L7e:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.util.ServiceConfigurationError -> L86
            r0.<init>()     // Catch: java.util.ServiceConfigurationError -> L86
            throw r0     // Catch: java.util.ServiceConfigurationError -> L86
        L84:
            r12 = r0
            goto L88
        L86:
            r0 = move-exception
            goto L84
        L88:
            java.lang.Class<ef7> r0 = defpackage.ef7.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r7 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r8 = java.util.logging.Level.SEVERE
            java.lang.String r0 = r2.getSimpleName()
            java.lang.String r10 = "load"
            java.lang.String r9 = "Unable to load "
            java.lang.String r11 = r9.concat(r0)
            java.lang.String r9 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            r7.logp(r8, r9, r10, r11, r12)
            goto L3f
        La6:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.P():ff7");
    }

    public static final void a(yz3 yz3Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        yz3 yz3Var2;
        os0 os0Var2;
        int i3;
        int i4;
        kd2Var.f0(790527681);
        byte b = 4;
        if ((i & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i2 & 1, z2)) {
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                ti4 ti4Var = new ti4(null, h95.H);
                kd2Var.n0(ti4Var);
                Q = ti4Var;
            }
            w44 w44Var = (w44) Q;
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = new cf(w44Var, (byte) 22);
                kd2Var.n0(Q2);
            }
            sb2 sb2Var = (sb2) Q2;
            yr4 yr4Var = xa1.a;
            f40 f = q23.f(wc7.b, kd2Var, 6);
            yz3Var2 = yz3Var;
            os0Var2 = os0Var;
            kb0.c(new mw4[]{z86.b.a(wc7.I(sb2Var, kd2Var, 2)), z86.a.a(f)}, nx7.R(1070596993, new ni((Object) yz3Var2, (Object) w44Var, (Object) os0Var2, (Object) f, (Object) sb2Var, (byte) 2), kd2Var), kd2Var, 56);
        } else {
            yz3Var2 = yz3Var;
            os0Var2 = os0Var;
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new bf(yz3Var2, os0Var2, i, b);
        }
    }

    public static final void b(final long j, final xd6 xd6Var, final os0 os0Var, kd2 kd2Var, final int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        kd2Var.f0(-684938728);
        if ((i & 6) == 0) {
            if (kd2Var.e(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(xd6Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i2 & 1, z2)) {
            tq1 tq1Var = yc6.a;
            kb0.c(new mw4[]{ey0.a.a(new ep0(j)), tq1Var.a(((xd6) kd2Var.j(tq1Var)).d(xd6Var))}, os0Var, kd2Var, ((i2 >> 3) & 112) | 8);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: lw4
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jf7.b(j, xd6Var, os0Var, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static final void c(yz3 yz3Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        kd2Var.f0(155925518);
        if ((i & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        byte b = 3;
        if (kd2Var.V(i2 & 1, z2)) {
            if (kd2Var.j(z86.a) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kd2Var.j(z86.b) != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 && z4) {
                kd2Var.e0(-1977187922);
                vo3 c = b90.c(pk2.y, true);
                int hashCode = Long.hashCode(kd2Var.T);
                al4 l = kd2Var.l();
                yz3 E = o80.E(kd2Var, yz3Var);
                tt0.d.getClass();
                kd2Var.h0();
                if (kd2Var.S) {
                    kd2Var.k(za3.p0);
                } else {
                    kd2Var.q0();
                }
                ss5.i(p7.F, kd2Var, c);
                ss5.i(p7.E, kd2Var, l);
                ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                ss5.h(kd2Var);
                ss5.i(p7.D, kd2Var, E);
                os0Var.invoke(kd2Var, Integer.valueOf((i2 >> 3) & 14));
                kd2Var.q(true);
                kd2Var.q(false);
            } else if (z3) {
                kd2Var.e0(-1976997706);
                wc7.c(yz3Var, os0Var, kd2Var, i2 & 126);
                kd2Var.q(false);
            } else if (z4) {
                kd2Var.e0(-1976846922);
                xa1.d(yz3Var, os0Var, kd2Var, i2 & 126);
                kd2Var.q(false);
            } else {
                kd2Var.e0(-1976716505);
                a(yz3Var, os0Var, kd2Var, i2 & 126);
                kd2Var.q(false);
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new bf(yz3Var, os0Var, i, b);
        }
    }

    public static final void d(wm6 wm6Var, final ub2 ub2Var, final sb2 sb2Var, final ub2 ub2Var2, final ub2 ub2Var3, ub2 ub2Var4, sb2 sb2Var2, final sb2 sb2Var3, final ub2 ub2Var5, final sb2 sb2Var4, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        w44 w44Var;
        int i3;
        int i4;
        String str;
        w44 w44Var2;
        boolean z3;
        boolean z4;
        wc3 wc3Var;
        List list;
        String str2;
        List list2;
        String str3;
        Object obj;
        p72 p72Var;
        vz0 vz0Var;
        boolean z5;
        boolean z6;
        Object obj2;
        int i5;
        w72 w72Var;
        wm6 wm6Var2;
        Object obj3;
        p72 p72Var2;
        wc3 wc3Var2;
        final af3 af3Var;
        boolean z7;
        boolean z8;
        List list3;
        boolean z9;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        wm6Var.getClass();
        List list4 = wm6Var.f;
        List list5 = wm6Var.h;
        String str4 = wm6Var.a;
        ub2Var.getClass();
        sb2Var.getClass();
        ub2Var2.getClass();
        ub2Var3.getClass();
        ub2Var4.getClass();
        sb2Var2.getClass();
        sb2Var3.getClass();
        ub2Var5.getClass();
        sb2Var4.getClass();
        kd2Var.f0(-2081525139);
        if (kd2Var.h(wm6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i15 = i2 | i;
        if ((i & 48) == 0) {
            if (kd2Var.h(ub2Var)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i15 |= i14;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(sb2Var)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i15 |= i13;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.h(ub2Var2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i15 |= i12;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.h(ub2Var3)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i15 |= i11;
        }
        if ((196608 & i) == 0) {
            if (kd2Var.h(ub2Var4)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i15 |= i10;
        }
        if ((1572864 & i) == 0) {
            if (kd2Var.h(sb2Var2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i15 |= i9;
        }
        if ((i & 12582912) == 0) {
            if (kd2Var.h(sb2Var3)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i15 |= i8;
        }
        if ((i & 100663296) == 0) {
            if (kd2Var.h(ub2Var5)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i15 |= i7;
        }
        if ((i & 805306368) == 0) {
            if (kd2Var.h(sb2Var4)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i15 |= i6;
        }
        int i16 = i15;
        if ((i16 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i16 & 1, z2)) {
            Object Q = kd2Var.Q();
            Object obj4 = au0.a;
            if (Q == obj4) {
                Q = new w72();
                kd2Var.n0(Q);
            }
            w72 w72Var2 = (w72) Q;
            p72 p72Var3 = (p72) kd2Var.j(bv0.i);
            wc3 a = yc3.a(kd2Var);
            af3 a2 = bf3.a(kd2Var);
            int length = str4.length();
            long a3 = fy5.a(length, length);
            Object[] objArr = new Object[0];
            p7 p7Var = p7.T;
            boolean f = kd2Var.f(str4) | kd2Var.e(a3);
            Object Q2 = kd2Var.Q();
            if (f || Q2 == obj4) {
                Q2 = new mf(str4, a3, (byte) 1);
                kd2Var.n0(Q2);
            }
            final ic6 ic6Var = (ic6) oi4.D(objArr, p7Var, (sb2) Q2, kd2Var, 48);
            Object[] objArr2 = new Object[0];
            Object Q3 = kd2Var.Q();
            if (Q3 == obj4) {
                Q3 = new r75((byte) 18);
                kd2Var.n0(Q3);
            }
            w44 w44Var3 = (w44) oi4.B(objArr2, (sb2) Q3, kd2Var);
            Object[] objArr3 = new Object[0];
            Object Q4 = kd2Var.Q();
            if (Q4 == obj4) {
                Q4 = new r75((byte) 19);
                kd2Var.n0(Q4);
            }
            w44 w44Var4 = (w44) oi4.B(objArr3, (sb2) Q4, kd2Var);
            String obj5 = ic6Var.c().A.toString();
            boolean z10 = !uz5.V(wm6Var.b);
            boolean f2 = kd2Var.f(obj5) | kd2Var.f(list5);
            Object Q5 = kd2Var.Q();
            if (!f2 && Q5 != obj4) {
                w44Var = w44Var3;
            } else {
                if (!uz5.V(obj5)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Iterator it2 = it;
                        w44 w44Var5 = w44Var3;
                        if (uz5.M((String) next, obj5, true)) {
                            arrayList.add(next);
                        }
                        it = it2;
                        w44Var3 = w44Var5;
                    }
                    list5 = arrayList;
                }
                w44Var = w44Var3;
                kd2Var.n0(list5);
                Q5 = list5;
            }
            List list6 = (List) Q5;
            boolean f3 = kd2Var.f(obj5) | kd2Var.f(list6);
            Object Q6 = kd2Var.Q();
            if (f3 || Q6 == obj4) {
                if (uz5.V(obj5)) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                Q6 = yo0.D0(list6, i3);
                kd2Var.n0(Q6);
            }
            List list7 = (List) Q6;
            boolean f4 = kd2Var.f(obj5) | kd2Var.f(list4) | kd2Var.f(list7);
            Object Q7 = kd2Var.Q();
            if (!f4 && Q7 != obj4) {
                str = obj5;
                w44Var2 = w44Var4;
            } else {
                ArrayList arrayList2 = new ArrayList(zo0.V(list7, 10));
                Iterator it3 = list7.iterator();
                while (it3.hasNext()) {
                    String obj6 = uz5.w0((String) it3.next()).toString();
                    List list8 = list4;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = obj6.toLowerCase(locale);
                    lowerCase.getClass();
                    arrayList2.add(lowerCase);
                    list4 = list8;
                }
                List list9 = list4;
                Set N0 = yo0.N0(arrayList2);
                if (uz5.V(obj5)) {
                    i4 = 5;
                } else {
                    int size = 8 - list7.size();
                    if (size < 0) {
                        size = 0;
                    }
                    i4 = size;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = list9.iterator();
                while (it4.hasNext()) {
                    String str5 = obj5;
                    Object next2 = it4.next();
                    Iterator it5 = it4;
                    String obj7 = uz5.w0(((SearchSuggestion) next2).getTitle()).toString();
                    w44 w44Var6 = w44Var4;
                    Locale locale2 = Locale.ROOT;
                    locale2.getClass();
                    String lowerCase2 = obj7.toLowerCase(locale2);
                    lowerCase2.getClass();
                    if (!N0.contains(lowerCase2)) {
                        arrayList3.add(next2);
                    }
                    obj5 = str5;
                    it4 = it5;
                    w44Var4 = w44Var6;
                }
                str = obj5;
                w44Var2 = w44Var4;
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList3.size();
                int i17 = 0;
                while (i17 < size2) {
                    int i18 = size2;
                    Object obj8 = arrayList3.get(i17);
                    int i19 = i17 + 1;
                    ArrayList arrayList5 = arrayList3;
                    String obj9 = uz5.w0(((SearchSuggestion) obj8).getTitle()).toString();
                    Locale locale3 = Locale.ROOT;
                    locale3.getClass();
                    String lowerCase3 = obj9.toLowerCase(locale3);
                    lowerCase3.getClass();
                    if (hashSet.add(lowerCase3)) {
                        arrayList4.add(obj8);
                    }
                    size2 = i18;
                    i17 = i19;
                    arrayList3 = arrayList5;
                }
                Q7 = yo0.D0(arrayList4, i4);
                kd2Var.n0(Q7);
            }
            List list10 = (List) Q7;
            boolean f5 = kd2Var.f(a);
            Object Q8 = kd2Var.Q();
            if (f5 || Q8 == obj4) {
                Q8 = ut5.b(new gc3(a, (byte) 1));
                kd2Var.n0(Q8);
            }
            px5 px5Var = (px5) Q8;
            Object value = px5Var.getValue();
            boolean f6 = kd2Var.f(px5Var);
            int i20 = i16 & 14;
            if (i20 != 4 && !kd2Var.h(wm6Var)) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z11 = f6 | z3;
            if ((i16 & 3670016) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z12 = z4 | z11;
            Object Q9 = kd2Var.Q();
            if (!z12 && Q9 != obj4) {
                wc3Var = a;
                wm6Var2 = wm6Var;
                list = list10;
                str2 = str4;
                list2 = list7;
                w72Var = w72Var2;
                str3 = str;
                obj = value;
                p72Var = p72Var3;
                vz0Var = null;
                z5 = z10;
                z6 = true;
                i5 = i20;
                obj2 = obj4;
            } else {
                wc3Var = a;
                list = list10;
                str2 = str4;
                list2 = list7;
                str3 = str;
                obj = value;
                p72Var = p72Var3;
                vz0Var = null;
                z5 = z10;
                z6 = true;
                obj2 = obj4;
                i5 = i20;
                w72Var = w72Var2;
                Object xgVar = new xg(px5Var, wm6Var, sb2Var2, vz0Var, (byte) 7);
                wm6Var2 = wm6Var;
                kd2Var.n0(xgVar);
                Q9 = xgVar;
            }
            db.f((ic2) Q9, kd2Var, obj);
            Page page = wm6Var2.e;
            if (page != null) {
                obj3 = page.getResults();
            } else {
                obj3 = vz0Var;
            }
            boolean h = kd2Var.h(page) | kd2Var.f(wc3Var);
            Object Q10 = kd2Var.Q();
            if (h || Q10 == obj2) {
                Q10 = new e52(page, wc3Var, vz0Var, (byte) 20);
                kd2Var.n0(Q10);
            }
            db.f((ic2) Q10, kd2Var, obj3);
            Boolean valueOf = Boolean.valueOf(wc3Var.h.a());
            Boolean valueOf2 = Boolean.valueOf(a2.j.a());
            boolean f7 = kd2Var.f(wc3Var) | kd2Var.f(a2) | kd2Var.h(p72Var);
            Object Q11 = kd2Var.Q();
            if (!f7 && Q11 != obj2) {
                af3Var = a2;
                p72Var2 = p72Var;
                wc3Var2 = wc3Var;
            } else {
                p72Var2 = p72Var;
                wc3Var2 = wc3Var;
                Q11 = new xg(wc3Var2, a2, p72Var2, vz0Var, (byte) 8);
                af3Var = a2;
                kd2Var.n0(Q11);
            }
            db.g(valueOf, valueOf2, (ic2) Q11, kd2Var);
            Object Q12 = kd2Var.Q();
            if (Q12 == obj2) {
                Q12 = new ji(w72Var, vz0Var, (byte) 7);
                kd2Var.n0(Q12);
            }
            db.f((ic2) Q12, kd2Var, pn6.a);
            boolean f8 = kd2Var.f(ic6Var);
            if ((i16 & 112) == 32) {
                z7 = z6;
            } else {
                z7 = false;
            }
            boolean z13 = f8 | z7;
            Object Q13 = kd2Var.Q();
            byte b = 21;
            if (z13 || Q13 == obj2) {
                Q13 = new e52(ub2Var, ic6Var, vz0Var, b);
                kd2Var.n0(Q13);
            }
            db.g(ic6Var, ub2Var, (ic2) Q13, kd2Var);
            if (i5 != 4 && !kd2Var.h(wm6Var2)) {
                z8 = false;
            } else {
                z8 = z6;
            }
            boolean f9 = z8 | kd2Var.f(ic6Var);
            Object Q14 = kd2Var.Q();
            if (f9 || Q14 == obj2) {
                Q14 = new yh(wm6Var2, ic6Var, vz0Var, b);
                kd2Var.n0(Q14);
            }
            db.f((ic2) Q14, kd2Var, str2);
            final String str6 = str3;
            Object[] objArr4 = {str6, Boolean.valueOf(z5), Boolean.valueOf(!list2.isEmpty()), Boolean.valueOf(!list.isEmpty())};
            final boolean z14 = z5;
            List list11 = list2;
            final List list12 = list;
            boolean g = kd2Var.g(z14) | kd2Var.h(list11) | kd2Var.h(list12) | kd2Var.f(af3Var);
            Object Q15 = kd2Var.Q();
            if (!g && Q15 != obj2) {
                list3 = list11;
            } else {
                list3 = list11;
                Q15 = new nj(z14, list3, list12, af3Var, (vz0) null);
                kd2Var.n0(Q15);
            }
            db.i(objArr4, (ic2) Q15, kd2Var);
            final w72 w72Var3 = w72Var;
            final wm6 wm6Var3 = wm6Var2;
            Object obj10 = obj2;
            final wc3 wc3Var3 = wc3Var2;
            final List list13 = list3;
            final w44 w44Var7 = w44Var;
            final w44 w44Var8 = w44Var2;
            final p72 p72Var4 = p72Var2;
            l36.a(ar5.c, null, ((mp0) kd2Var.j(op0.a)).n, 0L, 0.0f, 0.0f, null, nx7.R(-1653651448, new ic2() { // from class: ie5
                @Override // defpackage.ic2
                public final Object invoke(Object obj11, Object obj12) {
                    boolean z15;
                    t53 t53Var;
                    List list14;
                    kd2 kd2Var2 = (kd2) obj11;
                    int intValue = ((Integer) obj12).intValue();
                    y50 y50Var = pk2.C;
                    if ((intValue & 3) != 2) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (kd2Var2.V(intValue & 1, z15)) {
                        z22 z22Var = ar5.c;
                        yz3 V = n77.V(z22Var, 15.0f, 15.0f, 15.0f, 0.0f, 8);
                        xp0 a4 = vp0.a(x97.z, pk2.K, kd2Var2, 0);
                        int hashCode = Long.hashCode(kd2Var2.T);
                        al4 l = kd2Var2.l();
                        yz3 E = o80.E(kd2Var2, V);
                        tt0.d.getClass();
                        kd2Var2.h0();
                        boolean z16 = kd2Var2.S;
                        t53 t53Var2 = za3.p0;
                        if (z16) {
                            kd2Var2.k(t53Var2);
                        } else {
                            kd2Var2.q0();
                        }
                        st0 st0Var = p7.F;
                        ss5.i(st0Var, kd2Var2, a4);
                        ys0 ys0Var = p7.E;
                        ss5.i(ys0Var, kd2Var2, l);
                        Integer valueOf3 = Integer.valueOf(hashCode);
                        st0 st0Var2 = p7.G;
                        ss5.i(st0Var2, kd2Var2, valueOf3);
                        ss5.h(kd2Var2);
                        ys0 ys0Var2 = p7.D;
                        ss5.i(ys0Var2, kd2Var2, E);
                        vz3 vz3Var = vz3.x;
                        yz3 e = ar5.e(ar5.c(vz3Var, 1.0f), 64.0f);
                        final w72 w72Var4 = w72.this;
                        yz3 p = z51.p(e, w72Var4);
                        String f10 = lz5.f(R.string.search_placeholder, kd2Var2);
                        o83 o83Var = new o83(3, 3, 118);
                        final ic6 ic6Var2 = ic6Var;
                        boolean f11 = kd2Var2.f(ic6Var2);
                        final p72 p72Var5 = p72Var4;
                        boolean h2 = f11 | kd2Var2.h(p72Var5);
                        final ub2 ub2Var6 = ub2Var2;
                        boolean f12 = h2 | kd2Var2.f(ub2Var6);
                        Object Q16 = kd2Var2.Q();
                        q18 q18Var = au0.a;
                        if (f12 || Q16 == q18Var) {
                            Q16 = new he5(ic6Var2, p72Var5, ub2Var6);
                            kd2Var2.n0(Q16);
                        }
                        os0 R = nx7.R(-831402957, new je5(sb2Var4, (byte) 0), kd2Var2);
                        final String str7 = str6;
                        o80.b(ic6Var2, p, f10, null, 0, o83Var, (he5) Q16, R, nx7.R(-985176012, new df(str7, ic6Var2, sb2Var, (byte) 11), kd2Var2), kd2Var2, 905969664);
                        kd2 kd2Var3 = kd2Var2;
                        yz3 c = ar5.c(new ob3(1.0f, true), 1.0f);
                        vo3 c2 = b90.c(pk2.z, false);
                        int hashCode2 = Long.hashCode(kd2Var3.T);
                        al4 l2 = kd2Var3.l();
                        yz3 E2 = o80.E(kd2Var3, c);
                        kd2Var3.h0();
                        if (kd2Var3.S) {
                            t53Var = t53Var2;
                            kd2Var3.k(t53Var);
                        } else {
                            t53Var = t53Var2;
                            kd2Var3.q0();
                        }
                        ss5.i(st0Var, kd2Var3, c2);
                        ss5.i(ys0Var, kd2Var3, l2);
                        h11.q(hashCode2, kd2Var3, st0Var2, kd2Var3);
                        ss5.i(ys0Var2, kd2Var3, E2);
                        wm6 wm6Var4 = wm6Var3;
                        Page page2 = wm6Var4.e;
                        boolean z17 = wm6Var4.c;
                        if (page2 == null || (list14 = page2.getResults()) == null) {
                            list14 = nt1.x;
                        }
                        List list15 = list14;
                        boolean z18 = z14;
                        if (!z18 && wm6Var4.i) {
                            kd2Var3.e0(2111183081);
                            vo3 c3 = b90.c(y50Var, false);
                            int hashCode3 = Long.hashCode(kd2Var3.T);
                            al4 l3 = kd2Var3.l();
                            yz3 E3 = o80.E(kd2Var3, z22Var);
                            kd2Var3.h0();
                            if (kd2Var3.S) {
                                kd2Var3.k(t53Var);
                            } else {
                                kd2Var3.q0();
                            }
                            ss5.i(st0Var, kd2Var3, c3);
                            ss5.i(ys0Var, kd2Var3, l3);
                            h11.q(hashCode3, kd2Var3, st0Var2, kd2Var3);
                            ss5.i(ys0Var2, kd2Var3, E3);
                            cv4.a(null, ((mp0) kd2Var3.j(op0.a)).o, 0.0f, 0L, 0, 0.0f, kd2Var3, 0, 61);
                            kd2Var3 = kd2Var3;
                            kd2Var3.q(true);
                            kd2Var3.q(false);
                        } else {
                            if (!z18) {
                                final List list16 = list13;
                                boolean isEmpty = list16.isEmpty();
                                final List list17 = list12;
                                if (!isEmpty || !list17.isEmpty()) {
                                    kd2Var3.e0(2111847566);
                                    vh4 j = n77.j(0.0f, 4.0f, 1);
                                    boolean h3 = kd2Var3.h(list16) | kd2Var3.f(ic6Var2) | kd2Var3.h(p72Var5);
                                    final ub2 ub2Var7 = ub2Var3;
                                    boolean f13 = h3 | kd2Var3.f(ub2Var7);
                                    final ub2 ub2Var8 = ub2Var;
                                    boolean f14 = f13 | kd2Var3.f(ub2Var8);
                                    final w44 w44Var9 = w44Var7;
                                    boolean f15 = f14 | kd2Var3.f(w44Var9);
                                    final w44 w44Var10 = w44Var8;
                                    boolean f16 = f15 | kd2Var3.f(w44Var10) | kd2Var3.f(str7) | kd2Var3.h(list17) | kd2Var3.f(ub2Var6);
                                    Object Q17 = kd2Var3.Q();
                                    if (f16 || Q17 == q18Var) {
                                        Q17 = new ub2() { // from class: ke5
                                            @Override // defpackage.ub2
                                            public final Object invoke(Object obj13) {
                                                pe3 pe3Var = (pe3) obj13;
                                                pe3Var.getClass();
                                                la5 la5Var = new la5((byte) 27);
                                                List list18 = list16;
                                                int size3 = list18.size();
                                                od odVar = new od(la5Var, list18, (byte) 22);
                                                eo eoVar = new eo(list18, (byte) 13);
                                                ic6 ic6Var3 = ic6Var2;
                                                p72 p72Var6 = p72Var5;
                                                ub2 ub2Var9 = ub2Var7;
                                                ub2 ub2Var10 = ub2Var8;
                                                w44 w44Var11 = w44Var9;
                                                w44 w44Var12 = w44Var10;
                                                w72 w72Var5 = w72Var4;
                                                pe3Var.B0(size3, odVar, eoVar, new os0(802480018, true, new ne5(list18, ic6Var3, p72Var6, ub2Var9, ub2Var10, w44Var11, w44Var12, w72Var5)));
                                                String str8 = str7;
                                                boolean V2 = uz5.V(str8);
                                                List list19 = list17;
                                                if (V2 && !list19.isEmpty()) {
                                                    pe3.A0(pe3Var, "trending-title", n03.i, 2);
                                                }
                                                pe3Var.B0(list19.size(), new od(new la5((byte) 28), list19, (byte) 23), new eo(list19, (byte) 14), new os0(802480018, true, new oe5(list19, str8, ic6Var3, p72Var6, ub2Var6, ub2Var10, w72Var5)));
                                                return pn6.a;
                                            }
                                        };
                                        kd2Var3.n0(Q17);
                                    }
                                    n77.h(z22Var, af3Var, j, null, null, null, false, null, (ub2) Q17, kd2Var3, 390, 504);
                                    kd2Var3 = kd2Var3;
                                    kd2Var3.q(false);
                                }
                            }
                            if (!z18 && wm6Var4.g) {
                                kd2Var3.e0(1176627088);
                                kd2Var3.q(false);
                            } else if (!z18) {
                                kd2Var3.e0(2115756139);
                                h98.d(lz5.f(R.string.search_explore_title, kd2Var3), lz5.f(R.string.search_explore_subtitle, kd2Var3), n77.V(vz3Var, 0.0f, 150.0f, 0.0f, 0.0f, 13), kd2Var3, 384, 0);
                                kd2Var3.q(false);
                            } else if (wm6Var4.j != null && list15.isEmpty()) {
                                kd2Var3.e0(2116155357);
                                zz.b(wm6Var4.j, Status.SERVER_ERROR, null, null, sb2Var3, kd2Var3, 48, 12);
                                kd2Var3 = kd2Var3;
                                kd2Var3.q(false);
                            } else if (list15.isEmpty() && (z17 || wm6Var4.e == null)) {
                                kd2Var3.e0(2116508354);
                                yz3 i21 = ar5.i(n77.V(vz3Var, 0.0f, 150.0f, 0.0f, 0.0f, 13), 125.0f);
                                vo3 c4 = b90.c(y50Var, false);
                                int hashCode4 = Long.hashCode(kd2Var3.T);
                                al4 l4 = kd2Var3.l();
                                yz3 E4 = o80.E(kd2Var3, i21);
                                kd2Var3.h0();
                                if (kd2Var3.S) {
                                    kd2Var3.k(t53Var);
                                } else {
                                    kd2Var3.q0();
                                }
                                ss5.i(st0Var, kd2Var3, c4);
                                ss5.i(ys0Var, kd2Var3, l4);
                                h11.q(hashCode4, kd2Var3, st0Var2, kd2Var3);
                                ss5.i(ys0Var2, kd2Var3, E4);
                                io3.a(null, 0, 0.0f, kd2Var3, 0, 7);
                                kd2Var3.q(true);
                                kd2Var3.q(false);
                            } else if (!z17 && list15.isEmpty()) {
                                kd2Var3.e0(2116944741);
                                h98.d(lz5.f(R.string.search_no_results_title, kd2Var3), lz5.f(R.string.search_no_results_subtitle, kd2Var3), n77.V(vz3Var, 0.0f, 150.0f, 0.0f, 0.0f, 13), kd2Var3, 384, 0);
                                kd2Var3.q(false);
                            } else {
                                kd2Var3.e0(2117377935);
                                x97.b(z22Var, null, nx7.R(760404565, new sd3(wc3Var3, list15, ub2Var5, wm6Var4, (byte) 1), kd2Var3), kd2Var3, 3078, 6);
                                kd2Var3.q(false);
                            }
                        }
                        kd2Var3.q(true);
                        kd2Var3.q(true);
                    } else {
                        kd2Var2.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var), kd2Var, 12582918, 122);
            boolean booleanValue = ((Boolean) w44Var8.getValue()).booleanValue();
            String str7 = (String) w44Var7.getValue();
            if (str7 == null) {
                z9 = false;
                str7 = h11.i(kd2Var, 1109617652, R.string.search_history, kd2Var, false);
            } else {
                z9 = false;
                kd2Var.e0(1109616908);
                kd2Var.q(false);
            }
            String f10 = lz5.f(R.string.search_history_remove_description, kd2Var);
            String f11 = lz5.f(R.string.remove, kd2Var);
            String f12 = lz5.f(R.string.cancel, kd2Var);
            boolean f13 = kd2Var.f(w44Var7);
            if ((i16 & 458752) == 131072) {
                z9 = true;
            }
            boolean f14 = f13 | z9 | kd2Var.f(w44Var8);
            Object Q16 = kd2Var.Q();
            if (f14 || Q16 == obj10) {
                Q16 = new c01(ub2Var4, w44Var7, w44Var8, (byte) 1);
                kd2Var.n0(Q16);
            }
            sb2 sb2Var5 = (sb2) Q16;
            boolean f15 = kd2Var.f(w44Var8);
            Object Q17 = kd2Var.Q();
            if (f15 || Q17 == obj10) {
                Q17 = new cf(w44Var8, (byte) 24);
                kd2Var.n0(Q17);
            }
            sb2 sb2Var6 = (sb2) Q17;
            boolean f16 = kd2Var.f(w44Var7);
            Object Q18 = kd2Var.Q();
            if (f16 || Q18 == obj10) {
                Q18 = new cf(w44Var7, (byte) 25);
                kd2Var.n0(Q18);
            }
            iv.a(booleanValue, str7, f10, null, f11, f12, false, 0L, 0L, 0L, 0L, sb2Var5, sb2Var6, (sb2) Q18, kd2Var, 0, 0, 1992);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new cn2(wm6Var, ub2Var, sb2Var, ub2Var2, ub2Var3, ub2Var4, sb2Var2, sb2Var3, ub2Var5, sb2Var4, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r7v2, types: [t05, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.kd5 r4, float r5, defpackage.tw5 r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.lc5
            if (r0 == 0) goto L13
            r0 = r7
            lc5 r0 = (defpackage.lc5) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            lc5 r0 = new lc5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            t05 r4 = r0.x
            defpackage.m37.N(r7)
            goto L4b
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2e:
            defpackage.m37.N(r7)
            t05 r7 = new t05
            r7.<init>()
            mc5 r1 = new mc5
            r1.<init>(r5, r6, r7, r2)
            r0.x = r7
            r0.z = r3
            c54 r5 = defpackage.c54.x
            java.lang.Object r4 = r4.d(r5, r1, r0)
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L4a
            return r5
        L4a:
            r4 = r7
        L4b:
            float r4 = r4.x
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.e(kd5, float, tw5, xz0):java.lang.Object");
    }

    public static boolean f(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        if (f != f2 || f2 != fArr[2]) {
            return false;
        }
        return true;
    }

    public static List g(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new z23(0, iArr.length, iArr);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [wf0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [b45, java.lang.Object] */
    public static zf0 h(oc1 oc1Var) {
        ?? obj = new Object();
        obj.c = new Object();
        zf0 zf0Var = new zf0(obj);
        obj.b = zf0Var;
        obj.a = h11.class;
        try {
            oc1Var.l0(new i11(obj, oc1Var, (byte) 0));
            obj.a = "Deferred.asListenableFuture";
            return zf0Var;
        } catch (Exception e) {
            zf0Var.y.l(e);
            return zf0Var;
        }
    }

    public static final Object i(ii3 ii3Var, vz0 vz0Var) {
        try {
            if (ii3Var.isDone()) {
                return x2.h(ii3Var);
            }
            qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
            qg0Var.t();
            ii3Var.a(new zf6(ii3Var, qg0Var, (byte) 1), rg1.x);
            qg0Var.v(new bk(ii3Var, (byte) 6));
            return qg0Var.r();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }

    public static void k(b36 b36Var, Object[] objArr) {
        long j;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    b36Var.h(i);
                } else if (obj instanceof byte[]) {
                    b36Var.f(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    b36Var.b(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    b36Var.b(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    b36Var.e(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    b36Var.e(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    b36Var.e(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    b36Var.e(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    b36Var.w(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    b36Var.e(i, j);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.f91 r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.cs2
            if (r0 == 0) goto L13
            r0 = r7
            cs2 r0 = (defpackage.cs2) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            cs2 r0 = new cs2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.x
            int r1 = r0.y
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.m37.N(r7)
            goto L50
        L26:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r3
        L2c:
            defpackage.m37.N(r7)
            yp2 r6 = r6.d0()
            java.lang.Class<wc0> r7 = defpackage.wc0.class
            im0 r1 = defpackage.z05.a(r7)
            al6 r7 = defpackage.z05.c(r7)     // Catch: java.lang.Throwable -> L3e
            goto L3f
        L3e:
            r7 = r3
        L3f:
            vk6 r4 = new vk6
            r5 = 0
            r4.<init>(r1, r5, r7)
            r0.y = r2
            java.lang.Object r7 = r6.a(r4, r0)
            w11 r6 = defpackage.w11.x
            if (r7 != r6) goto L50
            return r6
        L50:
            if (r7 == 0) goto L55
            wc0 r7 = (defpackage.wc0) r7
            return r7
        L55:
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            defpackage.qi2.m(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.l(f91, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.f91 r6, java.nio.charset.Charset r7, defpackage.xz0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ds2
            if (r0 == 0) goto L13
            r0 = r8
            ds2 r0 = (defpackage.ds2) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ds2 r0 = new ds2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.y
            int r1 = r0.z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            java.nio.charset.CharsetDecoder r6 = r0.x
            defpackage.m37.N(r8)
            goto L7c
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r3
        L2e:
            defpackage.m37.N(r8)
            r6.getClass()
            jk2 r8 = r6.a()
            java.lang.String r1 = "Content-Type"
            java.lang.String r8 = r8.get(r1)
            if (r8 == 0) goto L47
            jz0 r1 = defpackage.jz0.e
            jz0 r8 = defpackage.io3.X(r8)
            goto L48
        L47:
            r8 = r3
        L48:
            if (r8 == 0) goto L4f
            java.nio.charset.Charset r8 = defpackage.mz0.a(r8)
            goto L50
        L4f:
            r8 = r3
        L50:
            if (r8 != 0) goto L53
            goto L54
        L53:
            r7 = r8
        L54:
            java.nio.charset.CharsetDecoder r7 = r7.newDecoder()
            yp2 r6 = r6.d0()
            java.lang.Class<cv5> r8 = defpackage.cv5.class
            im0 r1 = defpackage.z05.a(r8)
            al6 r8 = defpackage.z05.c(r8)     // Catch: java.lang.Throwable -> L67
            goto L68
        L67:
            r8 = r3
        L68:
            vk6 r4 = new vk6
            r5 = 0
            r4.<init>(r1, r5, r8)
            r0.x = r7
            r0.z = r2
            java.lang.Object r8 = r6.a(r4, r0)
            w11 r6 = defpackage.w11.x
            if (r8 != r6) goto L7b
            return r6
        L7b:
            r6 = r7
        L7c:
            if (r8 == 0) goto Ld8
            cv5 r8 = (defpackage.cv5) r8
            r6.getClass()
            oa0 r7 = r8.c()
            long r0 = r7.z
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = java.lang.Math.min(r2, r0)
            int r7 = (int) r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r8.g(r2)
            oa0 r7 = r8.c()
            long r4 = r7.z
            long r1 = java.lang.Math.min(r4, r2)
            java.nio.charset.Charset r7 = r6.charset()
            r7.getClass()
            java.nio.charset.Charset r3 = defpackage.kl0.a
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto Lbe
            r8.m(r1)
            oa0 r6 = r8.c()
            java.lang.String r6 = defpackage.gv5.b(r6, r1)
            goto Ld0
        Lbe:
            java.nio.charset.Charset r6 = r6.charset()
            r6.getClass()
            r8.m(r1)
            oa0 r7 = r8.c()
            java.lang.String r6 = defpackage.mv5.h(r7, r1, r6)
        Ld0:
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        Ld8:
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.io.Source"
            defpackage.qi2.m(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.m(f91, java.nio.charset.Charset, xz0):java.lang.Object");
    }

    public static final boolean n(Object obj) {
        if (obj instanceof rt5) {
            rt5 rt5Var = (rt5) obj;
            if (rt5Var.d() == h95.H || rt5Var.d() == p7.S || rt5Var.d() == pk2.c0) {
                Object value = rt5Var.getValue();
                if (value != null) {
                    return n(value);
                }
                return true;
            }
        } else if (!(obj instanceof ec2) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (z[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r5.equals("application/x-subrip") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r5.equals("text/x-ssa") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r5.equals("text/x-ass") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r5.equals("text/ssa") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r5.equals("text/srt") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r5.equals("text/ass") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r5.equals("application/ssa") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r5.equals("application/srt") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r5.equals("application/ass") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r5.equals("application/x-ssa") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (r5.equals("application/x-ass") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (r5.equals("text/x-subrip") == false) goto L82;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ni0 o(java.lang.String r4, java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.o(java.lang.String, java.lang.String):ni0");
    }

    public static void p(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                qi2.m(qx1.h(i2, "at index "));
                return;
            }
        }
    }

    public static int q(long j) {
        boolean z2;
        int i = (int) j;
        if (i == j) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.l(j, "Out of range: %s", z2);
        return i;
    }

    public static xq0 r(ub2... ub2VarArr) {
        if (ub2VarArr.length > 0) {
            return new xq0(ub2VarArr, (byte) 0);
        }
        ze0.k("Failed requirement.");
        return null;
    }

    public static int s(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            if (comparable2 == null) {
                return 0;
            }
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void t(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            p65.n(file, "Unable to create parent directories of ");
        }
    }

    public static int v(byte[] bArr) {
        boolean z2;
        if (bArr.length >= 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.j(bArr.length, 4, "array too small: %s < %s", z2);
        return w(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int w(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static Comparable x(vm1 vm1Var, vm1 vm1Var2) {
        if (vm1Var.compareTo(vm1Var2) >= 0) {
            return vm1Var;
        }
        return vm1Var2;
    }

    public static ss y(Iterable iterable) {
        Iterator it = iterable.iterator();
        long j = 0;
        long j2 = 0;
        while (it.hasNext()) {
            char charValue = ((Character) it.next()).charValue();
            if (charValue < 128) {
                if (charValue < '@') {
                    j |= 1 << charValue;
                } else {
                    j2 |= 1 << charValue;
                }
            } else {
                throw new IllegalArgumentException(("Only ASCII characters are supported, got '" + charValue + "' (code " + ((int) charValue) + ')').toString());
            }
        }
        return new ss(j, j2);
    }

    public static ss z(String str) {
        Iterable nsVar;
        if (str.length() == 0) {
            nsVar = nt1.x;
        } else {
            nsVar = new ns(str, (byte) 4);
        }
        return y(nsVar);
    }
}
