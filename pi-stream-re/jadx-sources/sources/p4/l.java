package p4;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8574a;

    static {
        Bitmap.Config config;
        int[] iArr = new int[Bitmap.Config.values().length];
        f8574a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8574a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8574a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            int[] iArr2 = f8574a;
            config = Bitmap.Config.RGBA_F16;
            iArr2[config.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f8574a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
