package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x02 {
    public final Context a;
    public final ContentResolver b;

    public x02(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = applicationContext.getContentResolver();
    }

    public static void a(File file, BufferedOutputStream bufferedOutputStream, sb2 sb2Var) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                sb2Var.invoke();
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a34.C(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    public final void b(String str) {
        if (str != null && !uz5.V(str)) {
            try {
                ContentResolver contentResolver = this.b;
                Uri parse = Uri.parse(str);
                parse.getClass();
                contentResolver.delete(parse, null, null);
            } catch (Throwable unused) {
            }
        }
    }

    public final w02 c(File file, String str, String str2, String str3, String str4, sb2 sb2Var) {
        Uri buildDocumentUriUsingTree;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        file.getClass();
        str.getClass();
        ContentResolver contentResolver = this.b;
        if (str4 == null) {
            Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
            contentUri.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/AniStation/" + str3 + "/");
            contentValues.put("is_pending", (Integer) 1);
            Uri insert = contentResolver.insert(contentUri, contentValues);
            if (insert != null) {
                try {
                    OutputStream openOutputStream = contentResolver.openOutputStream(insert, "w");
                    if (openOutputStream != null) {
                        if (openOutputStream instanceof BufferedOutputStream) {
                            bufferedOutputStream2 = (BufferedOutputStream) openOutputStream;
                        } else {
                            bufferedOutputStream2 = new BufferedOutputStream(openOutputStream, 8192);
                        }
                        try {
                            a(file, bufferedOutputStream2, sb2Var);
                            bufferedOutputStream2.close();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("is_pending", (Integer) 0);
                            sb2Var.invoke();
                            contentResolver.update(insert, contentValues2, null, null);
                            return new w02(insert, file.length());
                        } finally {
                        }
                    } else {
                        throw new IOException("Could not open the external download file");
                    }
                } catch (Throwable th) {
                    contentResolver.delete(insert, null, null);
                    throw th;
                }
            } else {
                qi2.k("Could not create the external download file");
                return null;
            }
        } else {
            Uri parse = Uri.parse(str4);
            parse.getClass();
            Uri buildDocumentUriUsingTree2 = DocumentsContract.buildDocumentUriUsingTree(parse, DocumentsContract.getTreeDocumentId(parse));
            buildDocumentUriUsingTree2.getClass();
            Cursor query = this.b.query(DocumentsContract.buildChildDocumentsUriUsingTree(parse, DocumentsContract.getDocumentId(buildDocumentUriUsingTree2)), new String[]{"document_id", "_display_name", "mime_type"}, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        if (a34.i(query.getString(1), str3) && a34.i(query.getString(2), "vnd.android.document/directory")) {
                            buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(parse, query.getString(0));
                            query.close();
                            break;
                        }
                    } finally {
                    }
                }
                query.close();
            }
            buildDocumentUriUsingTree = null;
            if (buildDocumentUriUsingTree == null && (buildDocumentUriUsingTree = DocumentsContract.createDocument(contentResolver, buildDocumentUriUsingTree2, "vnd.android.document/directory", str3)) == null) {
                qi2.k("Could not create the anime download folder");
                return null;
            }
            Uri createDocument = DocumentsContract.createDocument(contentResolver, buildDocumentUriUsingTree, str2, str);
            if (createDocument != null) {
                try {
                    OutputStream openOutputStream2 = contentResolver.openOutputStream(createDocument, "w");
                    if (openOutputStream2 != null) {
                        if (openOutputStream2 instanceof BufferedOutputStream) {
                            bufferedOutputStream = (BufferedOutputStream) openOutputStream2;
                        } else {
                            bufferedOutputStream = new BufferedOutputStream(openOutputStream2, 8192);
                        }
                        try {
                            a(file, bufferedOutputStream2, sb2Var);
                            bufferedOutputStream2.close();
                            sb2Var.invoke();
                            return new w02(createDocument, file.length());
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    throw new IOException("Could not open the external download file");
                } catch (Throwable th2) {
                    contentResolver.delete(createDocument, null, null);
                    throw th2;
                }
            }
            qi2.k("Could not create the external download file");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0017, code lost:
    
        r1 = r8.getDirectory();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File d(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.Class<android.os.storage.StorageManager> r0 = android.os.storage.StorageManager.class
            android.content.Context r7 = r7.a
            java.lang.Object r0 = r7.getSystemService(r0)
            android.os.storage.StorageManager r0 = (android.os.storage.StorageManager) r0
            android.os.storage.StorageVolume r8 = r0.getStorageVolume(r8)
            r8.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L1e
            java.io.File r1 = defpackage.y3.k(r8)
            if (r1 == 0) goto L1e
            return r1
        L1e:
            r1 = 0
            java.io.File[] r7 = r7.getExternalFilesDirs(r1)
            r7.getClass()
            int r2 = r7.length
            r3 = 0
        L28:
            if (r3 >= r2) goto L48
            r4 = r7[r3]
            if (r4 == 0) goto L45
            android.os.storage.StorageVolume r5 = r0.getStorageVolume(r4)
            if (r5 == 0) goto L39
            java.lang.String r5 = r5.getUuid()
            goto L3a
        L39:
            r5 = r1
        L3a:
            java.lang.String r6 = r8.getUuid()
            boolean r5 = defpackage.a34.i(r5, r6)
            if (r5 == 0) goto L45
            return r4
        L45:
            int r3 = r3 + 1
            goto L28
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x02.d(android.net.Uri):java.io.File");
    }
}
