package defpackage;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vu {
    public static final o15 e;
    public static final vu f;
    public static final o15 g;
    public static final rw2 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final nw2 c;
    public final nw2 d;

    static {
        o15 s = nw2.s(12);
        e = s;
        f = new vu(nw2.s(uu.d), s, o15.B);
        Object[] objArr = {2, 5, 6};
        jf7.p(objArr, 3);
        g = nw2.j(objArr, 3);
        eb2 eb2Var = new eb2(4);
        eb2Var.y(5, 6);
        eb2Var.y(17, 6);
        eb2Var.y(7, 6);
        eb2Var.y(30, 10);
        eb2Var.y(18, 6);
        eb2Var.y(6, 8);
        eb2Var.y(8, 8);
        eb2Var.y(14, 8);
        h = eb2Var.e(true);
    }

    public vu(o15 o15Var, nw2 nw2Var, List list) {
        for (int i = 0; i < o15Var.A; i++) {
            uu uuVar = (uu) o15Var.get(i);
            this.a.put(uuVar.a, uuVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((uu) this.a.valueAt(i3)).b);
        }
        this.b = i2;
        this.c = nw2.o(nw2Var);
        this.d = nw2.o(list);
    }

    public static o15 a(int[] iArr, int i) {
        jw2 k = nw2.k();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            k.c(new uu(i2, i));
        }
        return k.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0066, code lost:
    
        r13 = r7.getSpeakerLayoutChannelMask();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00a8, code lost:
    
        if (r13.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01d6, code lost:
    
        if (r2.isEmpty() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01d8, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01e6, code lost:
    
        if (r2.isEmpty() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0208, code lost:
    
        if (r2.isEmpty() == false) goto L130;
     */
    /* JADX WARN: Type inference failed for: r2v4, types: [ew2, yw2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.vu b(android.content.Context r20, android.content.Intent r21, defpackage.ru r22, android.media.AudioDeviceInfo r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu.b(android.content.Context, android.content.Intent, ru, android.media.AudioDeviceInfo, java.util.List):vu");
    }

    public final Pair c(ea2 ea2Var, ru ruVar) {
        int t;
        String str = ea2Var.p;
        int i = ea2Var.K;
        int i2 = ea2Var.J;
        str.getClass();
        int c = qy3.c(str, ea2Var.l);
        if (h.containsKey(Integer.valueOf(c))) {
            SparseArray sparseArray = this.a;
            if (c == 18 && !eq6.l(sparseArray, 18)) {
                c = 6;
            } else if ((c == 8 && !eq6.l(sparseArray, 8)) || (c == 30 && !eq6.l(sparseArray, 30))) {
                c = 7;
            }
            if (eq6.l(sparseArray, c)) {
                uu uuVar = (uu) sparseArray.get(c);
                uuVar.getClass();
                int i3 = uuVar.b;
                zw2 zw2Var = uuVar.c;
                boolean z = false;
                if (i2 != -1 && c != 18) {
                    if (ea2Var.p.equals("audio/vnd.dts.uhd;profile=p2") && Build.VERSION.SDK_INT < 33) {
                        if (i2 > 10) {
                            return null;
                        }
                    } else {
                        uu uuVar2 = uu.d;
                        if (zw2Var == null) {
                            if (i2 <= i3) {
                                z = true;
                            }
                        } else {
                            if (i != -1) {
                                t = i;
                            } else {
                                t = eq6.t(i2);
                            }
                            if (t != 0) {
                                z = zw2Var.contains(Integer.valueOf(t));
                            }
                        }
                        if (!z) {
                            return null;
                        }
                    }
                    i3 = i2;
                } else {
                    int i4 = ea2Var.L;
                    if (i4 == -1) {
                        i4 = 48000;
                    }
                    if (zw2Var == null) {
                        int i5 = uuVar.a;
                        i3 = 10;
                        while (true) {
                            if (i3 > 0) {
                                int t2 = eq6.t(i3);
                                if (t2 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i5).setSampleRate(i4).setChannelMask(t2).build(), ruVar.b())) {
                                    break;
                                }
                                i3--;
                            } else {
                                i3 = 0;
                                break;
                            }
                        }
                    }
                }
                HashSet hashSet = cr3.a;
                if (i == -1 || i2 != i3) {
                    i = eq6.t(i3);
                }
                if (i == 0) {
                    return null;
                }
                return Pair.create(Integer.valueOf(c), Integer.valueOf(i));
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto L6a
        L5:
            boolean r1 = r9 instanceof defpackage.vu
            r2 = 0
            if (r1 != 0) goto Lc
            goto L6b
        Lc:
            vu r9 = (defpackage.vu) r9
            android.util.SparseArray r1 = r9.a
            java.lang.String r3 = defpackage.eq6.a
            android.util.SparseArray r3 = r8.a
            if (r3 != 0) goto L1c
            if (r1 != 0) goto L1a
        L18:
            r1 = r0
            goto L4e
        L1a:
            r1 = r2
            goto L4e
        L1c:
            if (r1 != 0) goto L1f
            goto L1a
        L1f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L2a
            boolean r1 = defpackage.cl6.f(r3, r1)
            goto L4e
        L2a:
            int r4 = r3.size()
            int r5 = r1.size()
            if (r4 == r5) goto L35
            goto L1a
        L35:
            r5 = r2
        L36:
            if (r5 >= r4) goto L18
            int r6 = r3.keyAt(r5)
            java.lang.Object r7 = r3.valueAt(r5)
            java.lang.Object r6 = r1.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L4b
            goto L1a
        L4b:
            int r5 = r5 + 1
            goto L36
        L4e:
            if (r1 == 0) goto L6b
            int r1 = r8.b
            int r3 = r9.b
            if (r1 != r3) goto L6b
            nw2 r1 = r8.c
            nw2 r3 = r9.c
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L6b
            nw2 r8 = r8.d
            nw2 r9 = r9.d
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 == 0) goto L6b
        L6a:
            return r0
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = this.b * 31;
        String str = eq6.a;
        int i3 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.a;
        if (i3 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            i = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i = Objects.hashCode(sparseArray.valueAt(i4)) + ((sparseArray.keyAt(i4) + (i * 31)) * 31);
            }
        }
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((i2 + i) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
