package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.Log;
import android.util.SparseArray;
import com.anistation.model.settings.SubtitleArgbColor;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ls0 implements as0, y16, nw4 {
    public static final js0 F = new js0((byte) 0);
    public static final byte[] G = {0, 7, 8, 15};
    public static final byte[] H = {0, 119, -120, -1};
    public static final byte[] I = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public final /* synthetic */ byte x;
    public Object y;
    public Object z;

    /* JADX WARN: Multi-variable type inference failed */
    public ls0(ArrayList arrayList, ArrayList arrayList2, p18 p18Var) {
        int i = 0;
        Object[] objArr = 0;
        this.x = (byte) 0;
        this.y = new HashMap();
        this.z = new HashMap();
        this.A = new HashMap();
        this.B = new HashSet();
        this.D = new AtomicReference();
        lw1 lw1Var = new lw1();
        this.C = lw1Var;
        this.E = p18Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(kr0.a(lw1Var, lw1.class, f16.class, vw4.class));
        arrayList3.add(kr0.a(this, ls0.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            kr0 kr0Var = (kr0) obj;
            if (kr0Var != null) {
                arrayList3.add(kr0Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ow4) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((p18) this.E).x(componentRegistrar));
                        it.remove();
                    }
                } catch (c33 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((kr0) it2.next()).b.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj3 = array[i4];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.B).contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            ((HashSet) this.B).add(obj3.toString());
                        }
                        i4++;
                    }
                }
            }
            if (((HashMap) this.y).isEmpty()) {
                z51.m(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.y).keySet());
                arrayList6.addAll(arrayList3);
                z51.m(arrayList6);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList3.get(i5);
                i5++;
                kr0 kr0Var2 = (kr0) obj4;
                ((HashMap) this.y).put(kr0Var2, new qb3(new ks0(this, kr0Var2, objArr == true ? 1 : 0)));
            }
            arrayList5.addAll(r(arrayList3));
            arrayList5.addAll(s());
            q();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.D).get();
        if (bool != null) {
            c((HashMap) this.y, bool.booleanValue());
        }
    }

    public static byte[] a(int i, int i2, yi0 yi0Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) yi0Var.g(i2);
        }
        return bArr;
    }

    public static int[] e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            if (i6 < 8) {
                if ((i6 & 1) != 0) {
                    i3 = 255;
                } else {
                    i3 = 0;
                }
                if ((i6 & 2) != 0) {
                    i4 = 255;
                } else {
                    i4 = 0;
                }
                if ((i6 & 4) != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                iArr[i6] = m(255, i3, i4, i5);
            } else {
                int i7 = 127;
                if ((i6 & 1) != 0) {
                    i = 127;
                } else {
                    i = 0;
                }
                if ((i6 & 2) != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if ((i6 & 4) == 0) {
                    i7 = 0;
                }
                iArr[i6] = m(255, i, i2, i7);
            }
        }
        return iArr;
    }

    public static int[] g() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i19 = 0; i19 < 256; i19++) {
            int i20 = 255;
            if (i19 < 8) {
                if ((i19 & 1) != 0) {
                    i17 = 255;
                } else {
                    i17 = 0;
                }
                if ((i19 & 2) != 0) {
                    i18 = 255;
                } else {
                    i18 = 0;
                }
                if ((i19 & 4) == 0) {
                    i20 = 0;
                }
                iArr[i19] = m(63, i17, i18, i20);
            } else {
                int i21 = i19 & 136;
                int i22 = 170;
                int i23 = 85;
                if (i21 != 0) {
                    if (i21 != 8) {
                        int i24 = 43;
                        if (i21 != 128) {
                            if (i21 == 136) {
                                if ((i19 & 1) != 0) {
                                    i13 = 43;
                                } else {
                                    i13 = 0;
                                }
                                if ((i19 & 16) != 0) {
                                    i14 = 85;
                                } else {
                                    i14 = 0;
                                }
                                int i25 = i13 + i14;
                                if ((i19 & 2) != 0) {
                                    i15 = 43;
                                } else {
                                    i15 = 0;
                                }
                                if ((i19 & 32) != 0) {
                                    i16 = 85;
                                } else {
                                    i16 = 0;
                                }
                                int i26 = i15 + i16;
                                if ((i19 & 4) == 0) {
                                    i24 = 0;
                                }
                                if ((i19 & 64) == 0) {
                                    i23 = 0;
                                }
                                iArr[i19] = m(255, i25, i26, i24 + i23);
                            }
                        } else {
                            if ((i19 & 1) != 0) {
                                i9 = 43;
                            } else {
                                i9 = 0;
                            }
                            int i27 = i9 + 127;
                            if ((i19 & 16) != 0) {
                                i10 = 85;
                            } else {
                                i10 = 0;
                            }
                            int i28 = i27 + i10;
                            if ((i19 & 2) != 0) {
                                i11 = 43;
                            } else {
                                i11 = 0;
                            }
                            int i29 = i11 + 127;
                            if ((i19 & 32) != 0) {
                                i12 = 85;
                            } else {
                                i12 = 0;
                            }
                            int i30 = i29 + i12;
                            if ((i19 & 4) == 0) {
                                i24 = 0;
                            }
                            int i31 = i24 + 127;
                            if ((i19 & 64) == 0) {
                                i23 = 0;
                            }
                            iArr[i19] = m(255, i28, i30, i31 + i23);
                        }
                    } else {
                        if ((i19 & 1) != 0) {
                            i5 = 85;
                        } else {
                            i5 = 0;
                        }
                        if ((i19 & 16) != 0) {
                            i6 = 170;
                        } else {
                            i6 = 0;
                        }
                        int i32 = i5 + i6;
                        if ((i19 & 2) != 0) {
                            i7 = 85;
                        } else {
                            i7 = 0;
                        }
                        if ((i19 & 32) != 0) {
                            i8 = 170;
                        } else {
                            i8 = 0;
                        }
                        int i33 = i7 + i8;
                        if ((i19 & 4) == 0) {
                            i23 = 0;
                        }
                        if ((i19 & 64) == 0) {
                            i22 = 0;
                        }
                        iArr[i19] = m(127, i32, i33, i23 + i22);
                    }
                } else {
                    if ((i19 & 1) != 0) {
                        i = 85;
                    } else {
                        i = 0;
                    }
                    if ((i19 & 16) != 0) {
                        i2 = 170;
                    } else {
                        i2 = 0;
                    }
                    int i34 = i + i2;
                    if ((i19 & 2) != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if ((i19 & 32) != 0) {
                        i4 = 170;
                    } else {
                        i4 = 0;
                    }
                    int i35 = i3 + i4;
                    if ((i19 & 4) == 0) {
                        i23 = 0;
                    }
                    if ((i19 & 64) == 0) {
                        i22 = 0;
                    }
                    iArr[i19] = m(255, i34, i35, i23 + i22);
                }
            }
        }
        return iArr;
    }

    public static int m(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203 A[LOOP:3: B:86:0x0156->B:98:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls0.n(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static kq1 o(yi0 yi0Var, int i) {
        int[] iArr;
        int g;
        int i2;
        int g2;
        int i3;
        int i4;
        int i5 = 8;
        int g3 = yi0Var.g(8);
        yi0Var.o(8);
        int i6 = 2;
        int i7 = i - 2;
        int i8 = 0;
        int[] iArr2 = {0, -1, SubtitleArgbColor.BLACK, -8421505};
        int[] e = e();
        int[] g4 = g();
        while (i7 > 0) {
            int g5 = yi0Var.g(i5);
            int g6 = yi0Var.g(i5);
            if ((g6 & 128) != 0) {
                iArr = iArr2;
            } else if ((g6 & 64) != 0) {
                iArr = e;
            } else {
                iArr = g4;
            }
            if ((g6 & 1) != 0) {
                i3 = yi0Var.g(i5);
                i4 = yi0Var.g(i5);
                g = yi0Var.g(i5);
                g2 = yi0Var.g(i5);
                i2 = i7 - 6;
            } else {
                int g7 = yi0Var.g(6) << i6;
                int g8 = yi0Var.g(4) << 4;
                g = yi0Var.g(4) << 4;
                i2 = i7 - 4;
                g2 = yi0Var.g(i6) << 6;
                i3 = g7;
                i4 = g8;
            }
            if (i3 == 0) {
                i4 = i8;
                g = i4;
                g2 = 255;
            }
            double d = i3;
            double d2 = i4 - 128;
            double d3 = g - 128;
            iArr[g5] = m((byte) (255 - (g2 & 255)), eq6.j((int) ((1.402d * d2) + d), 0, 255), eq6.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), eq6.j((int) ((d3 * 1.772d) + d), 0, 255));
            i7 = i2;
            i8 = 0;
            g3 = g3;
            g4 = g4;
            i5 = 8;
            i6 = 2;
        }
        return new kq1(g3, iArr2, e, g4);
    }

    public static mq1 p(yi0 yi0Var) {
        byte[] bArr;
        int g = yi0Var.g(16);
        yi0Var.o(4);
        int g2 = yi0Var.g(2);
        boolean f = yi0Var.f();
        yi0Var.o(1);
        byte[] bArr2 = eq6.b;
        if (g2 == 1) {
            yi0Var.o(yi0Var.g(8) * 16);
        } else if (g2 == 0) {
            int g3 = yi0Var.g(16);
            int g4 = yi0Var.g(16);
            if (g3 > 0) {
                bArr2 = new byte[g3];
                yi0Var.j(g3, bArr2);
            }
            if (g4 > 0) {
                bArr = new byte[g4];
                yi0Var.j(g4, bArr);
                return new mq1(g, f, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new mq1(g, f, bArr2, bArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0075. Please report as an issue. */
    @Override // defpackage.y16
    public void E(byte[] bArr, int i, int i2, x16 x16Var, ay0 ay0Var) {
        e31 e31Var;
        SparseArray sparseArray;
        int i3;
        int i4;
        ArrayList arrayList;
        Paint paint;
        int i5;
        int i6;
        SparseArray sparseArray2;
        int i7;
        oq1 oq1Var;
        int i8;
        int i9;
        int[] iArr;
        Paint paint2;
        int i10;
        int[] iArr2;
        SparseArray sparseArray3;
        int i11;
        Paint paint3;
        int i12;
        oq1 oq1Var2;
        int i13;
        int i14;
        int i15;
        int i16;
        ls0 ls0Var = this;
        yi0 yi0Var = new yi0(i + i2, bArr);
        yi0Var.m(i);
        Paint paint4 = (Paint) ls0Var.z;
        Canvas canvas = (Canvas) ls0Var.A;
        qq1 qq1Var = (qq1) ls0Var.D;
        SparseArray sparseArray4 = qq1Var.f;
        SparseArray sparseArray5 = qq1Var.g;
        int i17 = qq1Var.b;
        SparseArray sparseArray6 = qq1Var.c;
        SparseArray sparseArray7 = qq1Var.d;
        SparseArray sparseArray8 = qq1Var.e;
        int i18 = qq1Var.a;
        while (yi0Var.b() >= 48 && yi0Var.g(8) == 15) {
            int g = yi0Var.g(8);
            int g2 = yi0Var.g(16);
            int g3 = yi0Var.g(16);
            int d = yi0Var.d() + g3;
            if (g3 * 8 > yi0Var.b()) {
                kb0.O("DvbParser", "Data field length exceeds limit");
                yi0Var.o(yi0Var.b());
                sparseArray3 = sparseArray5;
                i11 = i17;
                paint3 = paint4;
                i12 = i18;
            } else {
                switch (g) {
                    case 16:
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        if (g2 == i18) {
                            ed4 ed4Var = qq1Var.i;
                            int i19 = 8;
                            yi0Var.g(8);
                            int g4 = yi0Var.g(4);
                            int g5 = yi0Var.g(2);
                            yi0Var.o(2);
                            int i20 = g3 - 2;
                            SparseArray sparseArray9 = new SparseArray();
                            while (i20 > 0) {
                                int g6 = yi0Var.g(i19);
                                yi0Var.o(i19);
                                sparseArray9.put(g6, new nq1(yi0Var.g(16), yi0Var.g(16)));
                                i18 = i18;
                                i20 -= 6;
                                i19 = 8;
                            }
                            i12 = i18;
                            ed4 ed4Var2 = new ed4(g4, g5, sparseArray9);
                            if (g5 != 0) {
                                qq1Var.i = ed4Var2;
                                sparseArray6.clear();
                                sparseArray7.clear();
                                sparseArray8.clear();
                                break;
                            } else if (ed4Var != null && ed4Var.x != g4) {
                                qq1Var.i = ed4Var2;
                                break;
                            }
                        }
                        i12 = i18;
                        break;
                    case 17:
                        ed4 ed4Var3 = qq1Var.i;
                        if (g2 == i18 && ed4Var3 != null) {
                            int g7 = yi0Var.g(8);
                            yi0Var.o(4);
                            boolean f = yi0Var.f();
                            yi0Var.o(3);
                            int g8 = yi0Var.g(16);
                            int g9 = yi0Var.g(16);
                            yi0Var.g(3);
                            int g10 = yi0Var.g(3);
                            int i21 = 2;
                            yi0Var.o(2);
                            int g11 = yi0Var.g(8);
                            int g12 = yi0Var.g(8);
                            int g13 = yi0Var.g(4);
                            int g14 = yi0Var.g(2);
                            yi0Var.o(2);
                            int i22 = g3 - 10;
                            SparseArray sparseArray10 = new SparseArray();
                            while (i22 > 0) {
                                int i23 = i17;
                                int i24 = i22;
                                int g15 = yi0Var.g(16);
                                int g16 = yi0Var.g(i21);
                                yi0Var.g(i21);
                                Paint paint5 = paint4;
                                int g17 = yi0Var.g(12);
                                SparseArray sparseArray11 = sparseArray5;
                                yi0Var.o(4);
                                int g18 = yi0Var.g(12);
                                int i25 = i24 - 6;
                                if (g16 == 1 || g16 == 2) {
                                    yi0Var.g(8);
                                    yi0Var.g(8);
                                    i25 = i24 - 8;
                                }
                                sparseArray10.put(g15, new pq1(g17, g18));
                                i22 = i25;
                                i17 = i23;
                                paint4 = paint5;
                                sparseArray5 = sparseArray11;
                                i21 = 2;
                            }
                            sparseArray3 = sparseArray5;
                            i11 = i17;
                            paint3 = paint4;
                            oq1 oq1Var3 = new oq1(g7, f, g8, g9, g10, g11, g12, g13, g14, sparseArray10);
                            if (ed4Var3.y == 0 && (oq1Var2 = (oq1) sparseArray6.get(g7)) != null) {
                                SparseArray sparseArray12 = oq1Var2.j;
                                for (int i26 = 0; i26 < sparseArray12.size(); i26++) {
                                    oq1Var3.j.put(sparseArray12.keyAt(i26), (pq1) sparseArray12.valueAt(i26));
                                }
                            }
                            sparseArray6.put(oq1Var3.a, oq1Var3);
                            i12 = i18;
                            break;
                        }
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                    case 18:
                        if (g2 == i18) {
                            kq1 o = o(yi0Var, g3);
                            sparseArray7.put(o.a, o);
                        } else if (g2 == i17) {
                            kq1 o2 = o(yi0Var, g3);
                            sparseArray4.put(o2.a, o2);
                        }
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                    case 19:
                        if (g2 == i18) {
                            mq1 p = p(yi0Var);
                            sparseArray8.put(p.a, p);
                        } else if (g2 == i17) {
                            mq1 p2 = p(yi0Var);
                            sparseArray5.put(p2.a, p2);
                        }
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                    case 20:
                        if (g2 == i18) {
                            yi0Var.o(4);
                            boolean f2 = yi0Var.f();
                            yi0Var.o(3);
                            int g19 = yi0Var.g(16);
                            int g20 = yi0Var.g(16);
                            if (f2) {
                                int g21 = yi0Var.g(16);
                                int g22 = yi0Var.g(16);
                                int g23 = yi0Var.g(16);
                                i13 = g22;
                                i14 = yi0Var.g(16);
                                i16 = g23;
                                i15 = g21;
                            } else {
                                i13 = g19;
                                i14 = g20;
                                i15 = 0;
                                i16 = 0;
                            }
                            qq1Var.h = new lq1(g19, g20, i15, i13, i16, i14);
                        }
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                    default:
                        sparseArray3 = sparseArray5;
                        i11 = i17;
                        paint3 = paint4;
                        i12 = i18;
                        break;
                }
                yi0Var.p(d - yi0Var.d());
            }
            i18 = i12;
            i17 = i11;
            paint4 = paint3;
            sparseArray5 = sparseArray3;
        }
        SparseArray sparseArray13 = sparseArray5;
        Paint paint6 = paint4;
        ed4 ed4Var4 = qq1Var.i;
        if (ed4Var4 == null) {
            z62 z62Var = nw2.y;
            e31Var = new e31(-9223372036854775807L, -9223372036854775807L, o15.B);
        } else {
            lq1 lq1Var = qq1Var.h;
            if (lq1Var == null) {
                lq1Var = (lq1) ls0Var.B;
            }
            int i27 = lq1Var.b;
            int i28 = lq1Var.a;
            Bitmap bitmap = (Bitmap) ls0Var.E;
            if (bitmap == null || i28 + 1 != bitmap.getWidth() || i27 + 1 != ((Bitmap) ls0Var.E).getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(i28 + 1, i27 + 1, Bitmap.Config.ARGB_8888);
                ls0Var.E = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray14 = (SparseArray) ed4Var4.z;
            int i29 = 0;
            while (i29 < sparseArray14.size()) {
                canvas.save();
                nq1 nq1Var = (nq1) sparseArray14.valueAt(i29);
                oq1 oq1Var4 = (oq1) sparseArray6.get(sparseArray14.keyAt(i29));
                int i30 = nq1Var.a + lq1Var.c;
                int i31 = nq1Var.b + lq1Var.e;
                int i32 = oq1Var4.c;
                int i33 = oq1Var4.f;
                SparseArray sparseArray15 = sparseArray14;
                int i34 = oq1Var4.d;
                int i35 = i27;
                int i36 = i30 + i32;
                int i37 = i28;
                SparseArray sparseArray16 = sparseArray6;
                int i38 = i31 + i34;
                int i39 = i29;
                canvas.clipRect(i30, i31, Math.min(i36, lq1Var.d), Math.min(i38, lq1Var.f));
                kq1 kq1Var = (kq1) sparseArray7.get(i33);
                if (kq1Var == null && (kq1Var = (kq1) sparseArray4.get(i33)) == null) {
                    kq1Var = (kq1) ls0Var.C;
                }
                int[] iArr3 = kq1Var.b;
                int[] iArr4 = kq1Var.c;
                int[] iArr5 = kq1Var.d;
                lq1 lq1Var2 = lq1Var;
                SparseArray sparseArray17 = oq1Var4.j;
                SparseArray sparseArray18 = sparseArray4;
                int i40 = 0;
                while (i40 < sparseArray17.size()) {
                    int keyAt = sparseArray17.keyAt(i40);
                    SparseArray sparseArray19 = sparseArray17;
                    pq1 pq1Var = (pq1) sparseArray17.valueAt(i40);
                    mq1 mq1Var = (mq1) sparseArray8.get(keyAt);
                    int i41 = i40;
                    SparseArray sparseArray20 = sparseArray13;
                    if (mq1Var == null) {
                        mq1Var = (mq1) sparseArray20.get(keyAt);
                    }
                    mq1 mq1Var2 = mq1Var;
                    if (mq1Var2 != null) {
                        sparseArray13 = sparseArray20;
                        if (mq1Var2.b) {
                            paint2 = null;
                        } else {
                            paint2 = (Paint) ls0Var.y;
                        }
                        Paint paint7 = paint2;
                        oq1 oq1Var5 = oq1Var4;
                        int i42 = oq1Var5.e;
                        int i43 = pq1Var.a + i30;
                        int i44 = pq1Var.b + i31;
                        if (i42 == 3) {
                            sparseArray2 = sparseArray8;
                            i10 = i31;
                            iArr2 = iArr5;
                        } else if (i42 == 2) {
                            sparseArray2 = sparseArray8;
                            i10 = i31;
                            iArr2 = iArr4;
                        } else {
                            sparseArray2 = sparseArray8;
                            i10 = i31;
                            iArr2 = iArr3;
                        }
                        i8 = i30;
                        i9 = i32;
                        oq1Var = oq1Var5;
                        iArr = iArr4;
                        i6 = i34;
                        i7 = i10;
                        n(mq1Var2.c, iArr2, i42, i43, i44, paint7, canvas);
                        n(mq1Var2.d, iArr2, i42, i43, i44 + 1, paint7, canvas);
                    } else {
                        i6 = i34;
                        sparseArray13 = sparseArray20;
                        sparseArray2 = sparseArray8;
                        i7 = i31;
                        oq1Var = oq1Var4;
                        i8 = i30;
                        i9 = i32;
                        iArr = iArr4;
                    }
                    ls0Var = this;
                    i30 = i8;
                    i31 = i7;
                    oq1Var4 = oq1Var;
                    i40 = i41 + 1;
                    i34 = i6;
                    sparseArray17 = sparseArray19;
                    iArr4 = iArr;
                    sparseArray8 = sparseArray2;
                    i32 = i9;
                }
                int i45 = i34;
                SparseArray sparseArray21 = sparseArray8;
                int i46 = i31;
                oq1 oq1Var6 = oq1Var4;
                int i47 = i30;
                int i48 = i32;
                int[] iArr6 = iArr4;
                if (oq1Var6.b) {
                    int i49 = oq1Var6.e;
                    if (i49 == 3) {
                        i5 = iArr5[oq1Var6.g];
                        paint = paint6;
                    } else {
                        if (i49 == 2) {
                            i5 = iArr6[oq1Var6.h];
                        } else {
                            i5 = iArr3[oq1Var6.i];
                        }
                        paint = paint6;
                    }
                    paint.setColor(i5);
                    sparseArray = sparseArray7;
                    i3 = i35;
                    i4 = i37;
                    arrayList = arrayList2;
                    canvas.drawRect(i47, i46, i36, i38, paint);
                } else {
                    sparseArray = sparseArray7;
                    i3 = i35;
                    i4 = i37;
                    arrayList = arrayList2;
                    paint = paint6;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.E, i47, i46, i48, i45);
                float f3 = i4;
                float f4 = i47 / f3;
                float f5 = i46;
                float f6 = i3;
                arrayList.add(new b31(null, null, null, createBitmap2, f5 / f6, 0, 0, f4, 0, Integer.MIN_VALUE, -3.4028235E38f, i48 / f3, i45 / f6, false, SubtitleArgbColor.BLACK, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                ls0Var = this;
                paint6 = paint;
                sparseArray7 = sparseArray;
                i27 = i3;
                i28 = i4;
                arrayList2 = arrayList;
                sparseArray14 = sparseArray15;
                sparseArray6 = sparseArray16;
                sparseArray4 = sparseArray18;
                sparseArray8 = sparseArray21;
                i29 = i39 + 1;
                lq1Var = lq1Var2;
            }
            e31Var = new e31(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        ay0Var.accept(e31Var);
    }

    public void c(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            kr0 kr0Var = (kr0) entry.getKey();
            ow4 ow4Var = (ow4) entry.getValue();
            byte b = kr0Var.d;
            if (b == 1 || (b == 2 && z)) {
                ow4Var.get();
            }
        }
        lw1 lw1Var = (lw1) this.C;
        synchronized (lw1Var) {
            try {
                arrayDeque = lw1Var.b;
                if (arrayDeque != null) {
                    lw1Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw qx1.f(it);
            }
        }
    }

    @Override // defpackage.nw4
    public Object get() {
        return new kp6((Context) ((nw4) this.y).get(), (gy3) ((nw4) this.z).get(), (l85) ((nw4) this.A).get(), (dn0) ((dn0) this.B).get(), (Executor) ((nw4) this.C).get(), (l85) ((nw4) this.D).get(), new xb5((byte) 8), new z95((byte) 7), (l85) ((nw4) this.E).get());
    }

    public Object i(eq2 eq2Var) {
        Map map = (Map) ((mv0) this.D).d(fq2.a);
        if (map != null) {
            return map.get(eq2Var);
        }
        return null;
    }

    @Override // defpackage.as0
    public synchronized ow4 j(px4 px4Var) {
        ff3 ff3Var = (ff3) ((HashMap) this.A).get(px4Var);
        if (ff3Var != null) {
            return ff3Var;
        }
        return F;
    }

    @Override // defpackage.as0
    public synchronized ow4 k(px4 px4Var) {
        return (ow4) ((HashMap) this.z).get(px4Var);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [kg4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [ff3, java.lang.Object] */
    public void q() {
        for (kr0 kr0Var : ((HashMap) this.y).keySet()) {
            for (zd1 zd1Var : kr0Var.c) {
                if (zd1Var.b == 2 && !((HashMap) this.A).containsKey(zd1Var.a)) {
                    HashMap hashMap = (HashMap) this.A;
                    px4 px4Var = zd1Var.a;
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.b = null;
                    obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.a.addAll(set);
                    hashMap.put(px4Var, obj);
                } else if (((HashMap) this.z).containsKey(zd1Var.a)) {
                    continue;
                } else {
                    byte b = zd1Var.b;
                    if (b != 1) {
                        if (b != 2) {
                            HashMap hashMap2 = (HashMap) this.z;
                            px4 px4Var2 = zd1Var.a;
                            ov3 ov3Var = kg4.c;
                            js0 js0Var = kg4.d;
                            ?? obj2 = new Object();
                            obj2.a = ov3Var;
                            obj2.b = js0Var;
                            hashMap2.put(px4Var2, obj2);
                        }
                    } else {
                        throw new er0("Unsatisfied dependency for component " + kr0Var + ": " + zd1Var.a, (byte) 1);
                    }
                }
            }
        }
    }

    public ArrayList r(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.z;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kr0 kr0Var = (kr0) obj;
            if (!kr0Var.e) {
                ow4 ow4Var = (ow4) ((HashMap) this.y).get(kr0Var);
                for (px4 px4Var : kr0Var.b) {
                    if (!hashMap.containsKey(px4Var)) {
                        hashMap.put(px4Var, ow4Var);
                    } else {
                        arrayList2.add(new gb((kg4) ((ow4) hashMap.get(px4Var)), ow4Var, (byte) 12));
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // defpackage.y16
    public void reset() {
        qq1 qq1Var = (qq1) this.D;
        qq1Var.c.clear();
        qq1Var.d.clear();
        qq1Var.e.clear();
        qq1Var.f.clear();
        qq1Var.g.clear();
        qq1Var.h = null;
        qq1Var.i = null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ff3, java.lang.Object] */
    public ArrayList s() {
        HashMap hashMap = (HashMap) this.A;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.y).entrySet()) {
            kr0 kr0Var = (kr0) entry.getKey();
            if (kr0Var.e) {
                ow4 ow4Var = (ow4) entry.getValue();
                for (px4 px4Var : kr0Var.b) {
                    if (!hashMap2.containsKey(px4Var)) {
                        hashMap2.put(px4Var, new HashSet());
                    }
                    ((Set) hashMap2.get(px4Var)).add(ow4Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                px4 px4Var2 = (px4) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ?? obj = new Object();
                obj.b = null;
                obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.a.addAll(set);
                hashMap.put(px4Var2, obj);
            } else {
                ff3 ff3Var = (ff3) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new gb(ff3Var, (ow4) it.next(), (byte) 13));
                }
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.x) {
            case 3:
                return "HttpRequestData(url=" + ((op6) this.y) + ", method=" + ((xq2) this.z) + ')';
            default:
                return super.toString();
        }
    }

    public ls0(nw4 nw4Var, nw4 nw4Var2, nw4 nw4Var3, dn0 dn0Var, nw4 nw4Var4, nw4 nw4Var5, nw4 nw4Var6) {
        this.x = (byte) 4;
        this.y = nw4Var;
        this.z = nw4Var2;
        this.A = nw4Var3;
        this.B = dn0Var;
        this.C = nw4Var4;
        this.D = nw4Var5;
        this.E = nw4Var6;
    }

    public ls0(List list) {
        this.x = (byte) 1;
        zi4 zi4Var = new zi4((byte[]) list.get(0));
        int H2 = zi4Var.H();
        int H3 = zi4Var.H();
        Paint paint = new Paint();
        this.y = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.z = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.A = new Canvas();
        this.B = new lq1(719, 575, 0, 719, 0, 575);
        this.C = new kq1(0, new int[]{0, -1, SubtitleArgbColor.BLACK, -8421505}, e(), g());
        this.D = new qq1(H2, H3);
    }

    public ls0(op6 op6Var, xq2 xq2Var, nk2 nk2Var, yg4 yg4Var, q26 q26Var, mv0 mv0Var) {
        Object keySet;
        this.x = (byte) 3;
        xq2Var.getClass();
        this.y = op6Var;
        this.z = xq2Var;
        this.A = nk2Var;
        this.B = yg4Var;
        this.C = q26Var;
        this.D = mv0Var;
        Map map = (Map) mv0Var.d(fq2.a);
        this.E = (map == null || (keySet = map.keySet()) == null) ? tt1.x : keySet;
    }
}
