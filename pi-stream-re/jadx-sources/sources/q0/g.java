package q0;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import f.p0;

/* loaded from: classes.dex */
public final class g extends p0 {

    /* renamed from: c, reason: collision with root package name */
    public volatile w.r f8917c;

    /* renamed from: d, reason: collision with root package name */
    public volatile i.g f8918d;

    public g(l lVar) {
        super(lVar, 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x013e, code lost:
    
        if (r5 != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[Catch: all -> 0x014b, TryCatch #0 {all -> 0x014b, blocks: (B:101:0x001b, B:104:0x0020, B:106:0x0024, B:108:0x0031, B:9:0x0044, B:11:0x004c, B:13:0x004f, B:15:0x0053, B:17:0x005f, B:19:0x0062, B:23:0x006f, B:26:0x0077, B:31:0x009a, B:56:0x00a8, B:61:0x00b4, B:62:0x00be, B:43:0x00d5, B:46:0x00dc, B:34:0x00e1, B:36:0x00ec, B:65:0x00f2, B:67:0x00f6, B:69:0x00fc, B:71:0x0100, B:77:0x010d, B:80:0x0119, B:81:0x011f, B:83:0x0134, B:6:0x0039), top: B:100:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0119 A[Catch: all -> 0x014b, TryCatch #0 {all -> 0x014b, blocks: (B:101:0x001b, B:104:0x0020, B:106:0x0024, B:108:0x0031, B:9:0x0044, B:11:0x004c, B:13:0x004f, B:15:0x0053, B:17:0x005f, B:19:0x0062, B:23:0x006f, B:26:0x0077, B:31:0x009a, B:56:0x00a8, B:61:0x00b4, B:62:0x00be, B:43:0x00d5, B:46:0x00dc, B:34:0x00e1, B:36:0x00ec, B:65:0x00f2, B:67:0x00f6, B:69:0x00fc, B:71:0x0100, B:77:0x010d, B:80:0x0119, B:81:0x011f, B:83:0x0134, B:6:0x0039), top: B:100:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134 A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #0 {all -> 0x014b, blocks: (B:101:0x001b, B:104:0x0020, B:106:0x0024, B:108:0x0031, B:9:0x0044, B:11:0x004c, B:13:0x004f, B:15:0x0053, B:17:0x005f, B:19:0x0062, B:23:0x006f, B:26:0x0077, B:31:0x009a, B:56:0x00a8, B:61:0x00b4, B:62:0x00be, B:43:0x00d5, B:46:0x00dc, B:34:0x00e1, B:36:0x00ec, B:65:0x00f2, B:67:0x00f6, B:69:0x00fc, B:71:0x0100, B:77:0x010d, B:80:0x0119, B:81:0x011f, B:83:0x0134, B:6:0x0039), top: B:100:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence J(java.lang.CharSequence r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.g.J(java.lang.CharSequence, int, int, boolean):java.lang.CharSequence");
    }

    public final void K(EditorInfo editorInfo) {
        int i10;
        Bundle bundle = editorInfo.extras;
        r0.b bVar = (r0.b) this.f8918d.f5196b;
        int a10 = bVar.a(4);
        if (a10 != 0) {
            i10 = bVar.f9299b.getInt(a10 + bVar.f9298a);
        } else {
            i10 = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i10);
        Bundle bundle2 = editorInfo.extras;
        ((l) this.f3762b).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
