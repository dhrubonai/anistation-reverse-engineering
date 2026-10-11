package o8;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import q0.o;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final n8.a f8339a;

    /* renamed from: b, reason: collision with root package name */
    public float f8340b;

    /* renamed from: c, reason: collision with root package name */
    public float f8341c;

    /* renamed from: d, reason: collision with root package name */
    public float f8342d;

    /* renamed from: e, reason: collision with root package name */
    public float f8343e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8344f;

    public c(n8.a aVar) {
        this.f8339a = aVar;
    }

    public static void b(FrameLayout frameLayout, View view, float f10, float f11) {
        int max = Math.max(0, frameLayout.getWidth() - view.getWidth());
        int max2 = Math.max(0, frameLayout.getHeight() - view.getHeight());
        view.setX(Math.max(0.0f, Math.min(max, f10)));
        view.setY(Math.max(0.0f, Math.min(max2, f11)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r9 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri a(android.net.Uri r19) {
        /*
            r18 = this;
            r1 = r19
            java.lang.String r2 = "vnd.android.document/directory"
            java.lang.String r3 = "exception"
            java.lang.String r4 = "PlayerActivity"
            r5 = r18
            n8.a r0 = r5.f8339a
            a8.e r6 = r0.d()
            msr.pistream.app.ui.player.PlayerActivity r7 = r0.f8024b
            java.lang.String r0 = com.bumptech.glide.d.u(r6)
            java.lang.String r6 = com.bumptech.glide.d.W(r0)
            java.lang.String r8 = android.provider.DocumentsContract.getTreeDocumentId(r19)
            android.net.Uri r10 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r1, r8)
            java.lang.String r0 = "document_id"
            java.lang.String r15 = "_display_name"
            java.lang.String r14 = "mime_type"
            java.lang.String[] r11 = new java.lang.String[]{r0, r15, r14}
            r16 = 0
            android.content.ContentResolver r9 = r7.getContentResolver()     // Catch: java.lang.Exception -> L93
            r12 = 0
            r13 = 0
            r17 = 0
            r5 = r14
            r14 = r17
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L93
            if (r9 != 0) goto L42
            if (r9 == 0) goto L97
            goto L83
        L42:
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L87
            int r10 = r9.getColumnIndex(r15)     // Catch: java.lang.Throwable -> L87
            int r5 = r9.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L87
        L4e:
            boolean r11 = r9.moveToNext()     // Catch: java.lang.Throwable -> L87
            if (r11 == 0) goto L83
            java.lang.String r11 = ""
            if (r10 < 0) goto L5d
            java.lang.String r12 = r9.getString(r10)     // Catch: java.lang.Throwable -> L87
            goto L5e
        L5d:
            r12 = r11
        L5e:
            if (r5 < 0) goto L64
            java.lang.String r11 = r9.getString(r5)     // Catch: java.lang.Throwable -> L87
        L64:
            boolean r12 = r6.equals(r12)     // Catch: java.lang.Throwable -> L87
            if (r12 == 0) goto L4e
            boolean r11 = r2.equals(r11)     // Catch: java.lang.Throwable -> L87
            if (r11 == 0) goto L4e
            if (r0 < 0) goto L77
            java.lang.String r11 = r9.getString(r0)     // Catch: java.lang.Throwable -> L87
            goto L79
        L77:
            r11 = r16
        L79:
            if (r11 == 0) goto L4e
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r1, r11)     // Catch: java.lang.Throwable -> L87
            r9.close()     // Catch: java.lang.Exception -> L93
            goto L99
        L83:
            r9.close()     // Catch: java.lang.Exception -> L93
            goto L97
        L87:
            r0 = move-exception
            r5 = r0
            r9.close()     // Catch: java.lang.Throwable -> L8d
            goto L92
        L8d:
            r0 = move-exception
            r9 = r0
            r5.addSuppressed(r9)     // Catch: java.lang.Exception -> L93
        L92:
            throw r5     // Catch: java.lang.Exception -> L93
        L93:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L97:
            r0 = r16
        L99:
            if (r0 == 0) goto L9c
            return r0
        L9c:
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r1, r8)
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Exception -> La9
            android.net.Uri r0 = android.provider.DocumentsContract.createDocument(r1, r0, r2, r6)     // Catch: java.lang.Exception -> La9
            return r0
        La9:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.c.a(android.net.Uri):android.net.Uri");
    }

    public final void c(Uri uri, Bitmap bitmap) {
        this.f8339a.f8024b.O.execute(new o(this, uri, bitmap, 14));
    }
}
