package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ya implements ViewTranslationCallback {
    public static final ya a = new Object();

    public final boolean onClearTranslation(View view) {
        sb2 sb2Var;
        view.getClass();
        jb contentCaptureManager$ui = ((oa) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.B = fb.x;
        a13 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            p44 p44Var = ((wh5) objArr[(i << 3) + i3]).a.d.x;
                            Object g = p44Var.g(yh5.E);
                            Object obj = null;
                            if (g == null) {
                                g = null;
                            }
                            if (g != null) {
                                Object g2 = p44Var.g(oh5.n);
                                if (g2 != null) {
                                    obj = g2;
                                }
                                o3 o3Var = (o3) obj;
                                if (o3Var != null && (sb2Var = (sb2) o3Var.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onHideTranslation(View view) {
        ub2 ub2Var;
        view.getClass();
        jb contentCaptureManager$ui = ((oa) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.B = fb.x;
        a13 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            p44 p44Var = ((wh5) objArr[(i << 3) + i3]).a.d.x;
                            Object g = p44Var.g(yh5.E);
                            Object obj = null;
                            if (g == null) {
                                g = null;
                            }
                            if (a34.i(g, Boolean.TRUE)) {
                                Object g2 = p44Var.g(oh5.m);
                                if (g2 != null) {
                                    obj = g2;
                                }
                                o3 o3Var = (o3) obj;
                                if (o3Var != null && (ub2Var = (ub2) o3Var.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onShowTranslation(View view) {
        ub2 ub2Var;
        view.getClass();
        jb contentCaptureManager$ui = ((oa) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.B = fb.y;
        a13 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            p44 p44Var = ((wh5) objArr[(i << 3) + i3]).a.d.x;
                            Object g = p44Var.g(yh5.E);
                            Object obj = null;
                            if (g == null) {
                                g = null;
                            }
                            if (a34.i(g, Boolean.FALSE)) {
                                Object g2 = p44Var.g(oh5.m);
                                if (g2 != null) {
                                    obj = g2;
                                }
                                o3 o3Var = (o3) obj;
                                if (o3Var != null && (ub2Var = (ub2) o3Var.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}
