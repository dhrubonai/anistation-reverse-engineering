package f4;

import android.content.Context;
import android.net.Uri;
import v3.k;
import v3.l;
import v3.n;
import x3.e0;

/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final k f3921b = new k("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, k.f10645e);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3922a;

    public f(Context context) {
        this.f3922a = context.getApplicationContext();
    }

    @Override // v3.n
    public final /* bridge */ /* synthetic */ e0 a(Object obj, int i10, int i11, l lVar) {
        return c((Uri) obj, lVar);
    }

    @Override // v3.n
    public final boolean b(Object obj, l lVar) {
        String scheme = ((Uri) obj).getScheme();
        if (scheme != null && scheme.equals("android.resource")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x3.e0 c(android.net.Uri r9, v3.l r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Leb
            android.content.Context r1 = r8.f3922a
            java.lang.String r2 = r1.getPackageName()
            boolean r2 = r0.equals(r2)
            r3 = 0
            if (r2 == 0) goto L18
            goto L28
        L18:
            android.content.Context r2 = r1.createPackageContext(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            goto L29
        L1d:
            r2 = move-exception
            java.lang.String r4 = r1.getPackageName()
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Ld7
        L28:
            r2 = r1
        L29:
            java.util.List r4 = r9.getPathSegments()
            int r5 = r4.size()
            r6 = 2
            r7 = 1
            if (r5 != r6) goto L74
            java.util.List r4 = r9.getPathSegments()
            java.lang.String r5 = r9.getAuthority()
            java.lang.Object r6 = r4.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            android.content.res.Resources r7 = r2.getResources()
            int r5 = r7.getIdentifier(r4, r6, r5)
            if (r5 != 0) goto L5d
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            java.lang.String r7 = "android"
            int r5 = r5.getIdentifier(r4, r6, r7)
        L5d:
            if (r5 == 0) goto L60
            goto L8a
        L60:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to find resource id for: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        L74:
            int r4 = r4.size()
            java.lang.String r5 = "Unrecognized Uri format: "
            if (r4 != r7) goto Lc5
            java.util.List r4 = r9.getPathSegments()
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.NumberFormatException -> Lb2
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> Lb2
            int r5 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> Lb2
        L8a:
            java.lang.String r9 = r1.getPackageName()
            boolean r9 = r0.equals(r9)
            r0 = 0
            if (r9 == 0) goto L9e
            v3.k r9 = f4.f.f3921b
            java.lang.Object r9 = r10.c(r9)
            android.content.res.Resources$Theme r9 = (android.content.res.Resources.Theme) r9
            goto L9f
        L9e:
            r9 = r0
        L9f:
            if (r9 != 0) goto La6
            android.graphics.drawable.Drawable r9 = p7.a0.w(r1, r2, r5, r0)
            goto Laa
        La6:
            android.graphics.drawable.Drawable r9 = p7.a0.w(r1, r1, r5, r9)
        Laa:
            if (r9 == 0) goto Lb1
            f4.e r0 = new f4.e
            r0.<init>(r9, r3)
        Lb1:
            return r0
        Lb2:
            r10 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9, r10)
            throw r0
        Lc5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        Ld7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to obtain context or unrecognized Uri format for: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9, r2)
            throw r10
        Leb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Package name for "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = " is null or empty"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.f.c(android.net.Uri, v3.l):x3.e0");
    }
}
