package z;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import f.p0;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f11865a;

    /* renamed from: b, reason: collision with root package name */
    public static final n.j f11866b;

    static {
        boolean z9;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f11865a = new n();
        } else if (i10 >= 28) {
            f11865a = new m();
        } else if (i10 >= 26) {
            f11865a = new l();
        } else {
            if (i10 >= 24) {
                Method method = k.f11874e;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    f11865a = new k();
                }
            }
            f11865a = new j();
        }
        f11866b = new n.j(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r3.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r16, y.e r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, z7.c r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.i.a(android.content.Context, y.e, android.content.res.Resources, int, java.lang.String, int, int, z7.c, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
