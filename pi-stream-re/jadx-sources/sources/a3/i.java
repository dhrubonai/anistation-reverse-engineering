package a3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import f.r0;
import f1.b0;
import f1.s;
import f1.t;
import java.util.List;
import y2.l;

/* loaded from: classes.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f75a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f76b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f77c;

    /* renamed from: d, reason: collision with root package name */
    public final b f78d;

    /* renamed from: e, reason: collision with root package name */
    public final a f79e;

    /* renamed from: f, reason: collision with root package name */
    public final h f80f;

    /* renamed from: x, reason: collision with root package name */
    public Bitmap f81x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f73y = {0, 7, 8, 15};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f74z = {0, 119, -120, -1};
    public static final byte[] A = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    public i(List list) {
        t tVar = new t((byte[]) list.get(0));
        int A2 = tVar.A();
        int A3 = tVar.A();
        Paint paint = new Paint();
        this.f75a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f76b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f77c = new Canvas();
        this.f78d = new b(719, 575, 0, 719, 0, 575);
        this.f79e = new a(0, new int[]{0, -1, -16777216, -8421505}, a(), b());
        this.f80f = new h(A2, A3);
    }

    public static int[] a() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i15 = 1; i15 < 16; i15++) {
            if (i15 < 8) {
                if ((i15 & 1) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i15 & 2) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                if ((i15 & 4) != 0) {
                    i14 = 255;
                } else {
                    i14 = 0;
                }
                iArr[i15] = c(255, i12, i13, i14);
            } else {
                int i16 = 127;
                if ((i15 & 1) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i15 & 2) != 0) {
                    i11 = 127;
                } else {
                    i11 = 0;
                }
                if ((i15 & 4) == 0) {
                    i16 = 0;
                }
                iArr[i15] = c(255, i10, i11, i16);
            }
        }
        return iArr;
    }

    public static int[] b() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i28 = 0; i28 < 256; i28++) {
            int i29 = 255;
            if (i28 < 8) {
                if ((i28 & 1) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i28 & 2) != 0) {
                    i27 = 255;
                } else {
                    i27 = 0;
                }
                if ((i28 & 4) == 0) {
                    i29 = 0;
                }
                iArr[i28] = c(63, i26, i27, i29);
            } else {
                int i30 = i28 & 136;
                int i31 = 170;
                int i32 = 85;
                if (i30 != 0) {
                    if (i30 != 8) {
                        int i33 = 43;
                        if (i30 != 128) {
                            if (i30 == 136) {
                                if ((i28 & 1) != 0) {
                                    i22 = 43;
                                } else {
                                    i22 = 0;
                                }
                                if ((i28 & 16) != 0) {
                                    i23 = 85;
                                } else {
                                    i23 = 0;
                                }
                                int i34 = i22 + i23;
                                if ((i28 & 2) != 0) {
                                    i24 = 43;
                                } else {
                                    i24 = 0;
                                }
                                if ((i28 & 32) != 0) {
                                    i25 = 85;
                                } else {
                                    i25 = 0;
                                }
                                int i35 = i24 + i25;
                                if ((i28 & 4) == 0) {
                                    i33 = 0;
                                }
                                if ((i28 & 64) == 0) {
                                    i32 = 0;
                                }
                                iArr[i28] = c(255, i34, i35, i33 + i32);
                            }
                        } else {
                            if ((i28 & 1) != 0) {
                                i18 = 43;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i18 + 127;
                            if ((i28 & 16) != 0) {
                                i19 = 85;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i36 + i19;
                            if ((i28 & 2) != 0) {
                                i20 = 43;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i20 + 127;
                            if ((i28 & 32) != 0) {
                                i21 = 85;
                            } else {
                                i21 = 0;
                            }
                            int i39 = i38 + i21;
                            if ((i28 & 4) == 0) {
                                i33 = 0;
                            }
                            int i40 = i33 + 127;
                            if ((i28 & 64) == 0) {
                                i32 = 0;
                            }
                            iArr[i28] = c(255, i37, i39, i40 + i32);
                        }
                    } else {
                        if ((i28 & 1) != 0) {
                            i14 = 85;
                        } else {
                            i14 = 0;
                        }
                        if ((i28 & 16) != 0) {
                            i15 = 170;
                        } else {
                            i15 = 0;
                        }
                        int i41 = i14 + i15;
                        if ((i28 & 2) != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        if ((i28 & 32) != 0) {
                            i17 = 170;
                        } else {
                            i17 = 0;
                        }
                        int i42 = i16 + i17;
                        if ((i28 & 4) == 0) {
                            i32 = 0;
                        }
                        if ((i28 & 64) == 0) {
                            i31 = 0;
                        }
                        iArr[i28] = c(127, i41, i42, i32 + i31);
                    }
                } else {
                    if ((i28 & 1) != 0) {
                        i10 = 85;
                    } else {
                        i10 = 0;
                    }
                    if ((i28 & 16) != 0) {
                        i11 = 170;
                    } else {
                        i11 = 0;
                    }
                    int i43 = i10 + i11;
                    if ((i28 & 2) != 0) {
                        i12 = 85;
                    } else {
                        i12 = 0;
                    }
                    if ((i28 & 32) != 0) {
                        i13 = 170;
                    } else {
                        i13 = 0;
                    }
                    int i44 = i12 + i13;
                    if ((i28 & 4) == 0) {
                        i32 = 0;
                    }
                    if ((i28 & 64) == 0) {
                        i31 = 0;
                    }
                    iArr[i28] = c(255, i43, i44, i32 + i31);
                }
            }
        }
        return iArr;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0200 A[LOOP:6: B:96:0x0168->B:106:0x0200, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.i.d(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a e(int i10, s sVar) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        int i16 = sVar.i(8);
        sVar.r(8);
        int i17 = i10 - 2;
        int i18 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] a10 = a();
        int[] b10 = b();
        while (i17 > 0) {
            int i19 = sVar.i(i15);
            int i20 = sVar.i(i15);
            int i21 = i17 - 2;
            if ((i20 & 128) != 0) {
                iArr = iArr2;
            } else if ((i20 & 64) != 0) {
                iArr = a10;
            } else {
                iArr = b10;
            }
            if ((i20 & 1) != 0) {
                i13 = sVar.i(i15);
                i14 = sVar.i(i15);
                i11 = sVar.i(i15);
                i12 = sVar.i(i15);
                i17 = i21 - 4;
            } else {
                int i22 = sVar.i(6) << 2;
                int i23 = sVar.i(4) << 4;
                i17 = i21 - 2;
                i11 = sVar.i(4) << 4;
                i12 = sVar.i(2) << 6;
                i13 = i22;
                i14 = i23;
            }
            if (i13 == 0) {
                i14 = i18;
                i11 = i14;
                i12 = 255;
            }
            double d10 = i13;
            double d11 = i14 - 128;
            double d12 = i11 - 128;
            iArr[i19] = c((byte) (255 - (i12 & 255)), b0.h((int) ((1.402d * d11) + d10), 0, 255), b0.h((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), b0.h((int) ((d12 * 1.772d) + d10), 0, 255));
            i18 = 0;
            b10 = b10;
            i16 = i16;
            i15 = 8;
        }
        return new a(i16, iArr2, a10, b10);
    }

    public static c g(s sVar) {
        byte[] bArr;
        int i10 = sVar.i(16);
        sVar.r(4);
        int i11 = sVar.i(2);
        boolean h10 = sVar.h();
        sVar.r(1);
        byte[] bArr2 = b0.f3804f;
        if (i11 == 1) {
            sVar.r(sVar.i(8) * 16);
        } else if (i11 == 0) {
            int i12 = sVar.i(16);
            int i13 = sVar.i(16);
            if (i12 > 0) {
                bArr2 = new byte[i12];
                sVar.k(bArr2, i12);
            }
            if (i13 > 0) {
                bArr = new byte[i13];
                sVar.k(bArr, i13);
                return new c(i10, h10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(i10, h10, bArr2, bArr);
    }

    @Override // y2.l
    public final void f() {
        h hVar = this.f80f;
        ((SparseArray) hVar.f66c).clear();
        ((SparseArray) hVar.f67d).clear();
        ((SparseArray) hVar.f68e).clear();
        ((SparseArray) hVar.f69f).clear();
        ((SparseArray) hVar.f70g).clear();
        hVar.f71h = null;
        hVar.f72i = null;
    }

    @Override // y2.l
    public final /* synthetic */ void k(byte[] bArr, r0 r0Var, w.f fVar) {
        r.f.a(this, bArr, r0Var, fVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0202, code lost:
    
        r2.s(r12 - r2.f());
     */
    @Override // y2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(byte[] r47, int r48, int r49, f.r0 r50, f1.c r51) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.i.o(byte[], int, int, f.r0, f1.c):void");
    }

    @Override // y2.l
    public final /* synthetic */ y2.d r(byte[] bArr, int i10, int i11) {
        return r.f.b(this, bArr, i10, i11);
    }

    @Override // y2.l
    public final int x() {
        return 2;
    }
}
