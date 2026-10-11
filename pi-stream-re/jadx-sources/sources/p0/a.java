package p0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import e0.j;
import java.util.ArrayList;
import w7.b;

/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8416b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f8417c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f8418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(j jVar, Context context, Uri uri, int i10) {
        super(jVar);
        this.f8416b = i10;
        this.f8417c = context;
        this.f8418d = uri;
    }

    @Override // e0.j
    public final a b(String str) {
        Uri uri;
        switch (this.f8416b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.f8417c;
                try {
                    uri = DocumentsContract.createDocument(context.getContentResolver(), this.f8418d, "vnd.android.document/directory", str);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return new a(this, context, uri, 1);
        }
    }

    @Override // e0.j
    public final a c(String str, String str2) {
        Uri uri;
        switch (this.f8416b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.f8417c;
                try {
                    uri = DocumentsContract.createDocument(context.getContentResolver(), this.f8418d, str, str2);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return new a(this, context, uri, 1);
        }
    }

    @Override // e0.j
    public final String f() {
        int i10 = this.f8416b;
        Uri uri = this.f8418d;
        Context context = this.f8417c;
        switch (i10) {
            case 0:
                return b.T(context, uri, "_display_name");
            default:
                return b.T(context, uri, "_display_name");
        }
    }

    @Override // e0.j
    public final boolean g() {
        int i10 = this.f8416b;
        Uri uri = this.f8418d;
        Context context = this.f8417c;
        switch (i10) {
            case 0:
                return "vnd.android.document/directory".equals(b.T(context, uri, "mime_type"));
            default:
                return "vnd.android.document/directory".equals(b.T(context, uri, "mime_type"));
        }
    }

    @Override // e0.j
    public final boolean h() {
        int i10 = this.f8416b;
        Uri uri = this.f8418d;
        Context context = this.f8417c;
        switch (i10) {
            case 0:
                String T = b.T(context, uri, "mime_type");
                if (!"vnd.android.document/directory".equals(T) && !TextUtils.isEmpty(T)) {
                    return true;
                }
                return false;
            default:
                String T2 = b.T(context, uri, "mime_type");
                if (!"vnd.android.document/directory".equals(T2) && !TextUtils.isEmpty(T2)) {
                    return true;
                }
                return false;
        }
    }

    @Override // e0.j
    public final long k() {
        int i10 = this.f8416b;
        Uri uri = this.f8418d;
        Context context = this.f8417c;
        switch (i10) {
            case 0:
                return b.L(context, uri);
            default:
                return b.L(context, uri);
        }
    }

    @Override // e0.j
    public final j[] l() {
        switch (this.f8416b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.f8417c;
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = this.f8418d;
                Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
                ArrayList arrayList = new ArrayList();
                int i10 = 1;
                Cursor cursor = null;
                try {
                    try {
                        cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                        while (cursor.moveToNext()) {
                            arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursor.getString(0)));
                        }
                    } catch (Exception e10) {
                        Log.w("DocumentFile", "Failed query: " + e10);
                    }
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (RuntimeException e11) {
                            throw e11;
                        } catch (Exception unused) {
                        }
                    }
                    Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                    j[] jVarArr = new j[uriArr.length];
                    for (int i11 = 0; i11 < uriArr.length; i11++) {
                        jVarArr[i11] = new a(this, context, uriArr[i11], i10);
                    }
                    return jVarArr;
                } catch (Throwable th) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (RuntimeException e12) {
                            throw e12;
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
        }
    }
}
