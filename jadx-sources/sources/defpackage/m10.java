package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.provider.MediaStore;
import com.anistation.local.AniStationDatabase;
import com.anistation.model.backup.BackupFrequency;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m10 implements w00 {
    public static final String l = h11.j(Environment.DIRECTORY_DOWNLOADS, "/AniStation/Backups/");
    public final AniStationDatabase a;
    public final tm b;
    public final zx6 c;
    public final hh2 d;
    public final av6 e;
    public final yq f;
    public final i20 g;
    public final ok1 h;
    public final Context i;
    public final l77 j;
    public final m54 k;

    public m10(Context context, AniStationDatabase aniStationDatabase, tm tmVar, zx6 zx6Var, hh2 hh2Var, av6 av6Var, yq yqVar, i20 i20Var, ok1 ok1Var) {
        this.a = aniStationDatabase;
        this.b = tmVar;
        this.c = zx6Var;
        this.d = hh2Var;
        this.e = av6Var;
        this.f = yqVar;
        this.g = i20Var;
        this.h = ok1Var;
        Context applicationContext = context.getApplicationContext();
        this.i = applicationContext;
        applicationContext.getClass();
        this.j = l77.b(applicationContext);
        this.k = new m54();
    }

    public static BackupFrequency c(String str) {
        Object obj;
        Iterator<E> it = BackupFrequency.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (a34.i(((BackupFrequency) obj).name(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BackupFrequency backupFrequency = (BackupFrequency) obj;
        if (backupFrequency == null) {
            return BackupFrequency.NEVER;
        }
        return backupFrequency;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (r8.a(r0) == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r1v4, types: [k54] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.xz0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.b10
            if (r0 == 0) goto L13
            r0 = r8
            b10 r0 = (defpackage.b10) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            b10 r0 = new b10
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.y
            int r1 = r0.A
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            k54 r7 = r0.x
            defpackage.m37.N(r8)     // Catch: java.lang.Throwable -> L2d
            goto L63
        L2d:
            r8 = move-exception
            goto L6d
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r4
        L35:
            k54 r1 = r0.x
            defpackage.m37.N(r8)
            r8 = r1
            goto L4c
        L3c:
            defpackage.m37.N(r8)
            m54 r8 = r7.k
            r0.x = r8
            r0.A = r3
            java.lang.Object r1 = r8.a(r0)
            if (r1 != r5) goto L4c
            goto L5f
        L4c:
            ja1 r1 = defpackage.rh1.a     // Catch: java.lang.Throwable -> L69
            j91 r1 = defpackage.j91.y     // Catch: java.lang.Throwable -> L69
            d10 r3 = new d10     // Catch: java.lang.Throwable -> L69
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L69
            r0.x = r8     // Catch: java.lang.Throwable -> L69
            r0.A = r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = defpackage.tl7.V(r1, r3, r0)     // Catch: java.lang.Throwable -> L69
            if (r7 != r5) goto L60
        L5f:
            return r5
        L60:
            r6 = r8
            r8 = r7
            r7 = r6
        L63:
            com.anistation.model.backup.BackupResult r8 = (com.anistation.model.backup.BackupResult) r8     // Catch: java.lang.Throwable -> L2d
            r7.l(r4)
            return r8
        L69:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L6d:
            r7.l(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m10.a(xz0):java.lang.Object");
    }

    public final ai3 b() {
        String[] strArr = {l, "AniStation-backup-%.anistationbackup"};
        ai3 y = te4.y();
        Cursor query = this.i.getContentResolver().query(MediaStore.Downloads.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "date_modified"}, "relative_path = ? AND _display_name LIKE ?", strArr, null);
        if (query != null) {
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("_display_name");
                int columnIndexOrThrow3 = query.getColumnIndexOrThrow("date_modified");
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow2);
                    DateTimeFormatter dateTimeFormatter = o00.a;
                    string.getClass();
                    if (o00.a(string) != null) {
                        y.add(new x00(query.getLong(columnIndexOrThrow), string, query.getLong(columnIndexOrThrow3)));
                    }
                }
                query.close();
            } finally {
            }
        }
        return te4.r(y);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.net.Uri r9, defpackage.xz0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.h10
            if (r0 == 0) goto L13
            r0 = r10
            h10 r0 = (defpackage.h10) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            h10 r0 = new h10
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.z
            int r1 = r0.B
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            k54 r8 = r0.y
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L2d
            goto L69
        L2d:
            r9 = move-exception
            goto L73
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r4
        L35:
            k54 r9 = r0.y
            android.net.Uri r1 = r0.x
            defpackage.m37.N(r10)
            goto L51
        L3d:
            defpackage.m37.N(r10)
            r0.x = r9
            m54 r10 = r8.k
            r0.y = r10
            r0.B = r3
            java.lang.Object r1 = r10.a(r0)
            if (r1 != r5) goto L4f
            goto L67
        L4f:
            r1 = r9
            r9 = r10
        L51:
            ja1 r10 = defpackage.rh1.a     // Catch: java.lang.Throwable -> L6f
            j91 r10 = defpackage.j91.y     // Catch: java.lang.Throwable -> L6f
            j10 r3 = new j10     // Catch: java.lang.Throwable -> L6f
            r6 = 0
            r3.<init>(r8, r1, r4, r6)     // Catch: java.lang.Throwable -> L6f
            r0.x = r4     // Catch: java.lang.Throwable -> L6f
            r0.y = r9     // Catch: java.lang.Throwable -> L6f
            r0.B = r2     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r10 = defpackage.tl7.V(r10, r3, r0)     // Catch: java.lang.Throwable -> L6f
            if (r10 != r5) goto L68
        L67:
            return r5
        L68:
            r8 = r9
        L69:
            com.anistation.model.backup.RestoreResult r10 = (com.anistation.model.backup.RestoreResult) r10     // Catch: java.lang.Throwable -> L2d
            r8.l(r4)
            return r10
        L6f:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L73:
            r8.l(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m10.d(android.net.Uri, xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (((defpackage.zl1) r3).b(r11, r0) == r8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.m00 r10, defpackage.xz0 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.k10
            if (r0 == 0) goto L13
            r0 = r11
            k10 r0 = (defpackage.k10) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            k10 r0 = new k10
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.y
            int r1 = r0.A
            pn6 r2 = defpackage.pn6.a
            ok1 r3 = r9.h
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            w11 r8 = defpackage.w11.x
            if (r1 == 0) goto L42
            if (r1 == r6) goto L3c
            if (r1 == r5) goto L38
            if (r1 != r4) goto L32
            defpackage.m37.N(r11)
            return r2
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            return r7
        L38:
            defpackage.m37.N(r11)
            return r2
        L3c:
            m00 r10 = r0.x
            defpackage.m37.N(r11)
            goto L55
        L42:
            defpackage.m37.N(r11)
            boolean r11 = r10.a
            r0.x = r10
            r0.A = r6
            r1 = r3
            zl1 r1 = (defpackage.zl1) r1
            java.lang.Object r11 = r1.b(r11, r0)
            if (r11 != r8) goto L55
            goto Lba
        L55:
            java.lang.String r11 = r10.b
            if (r11 == 0) goto Lae
            android.content.Context r9 = r9.i
            android.content.ContentResolver r9 = r9.getContentResolver()
            java.util.List r9 = r9.getPersistedUriPermissions()
            r9.getClass()
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L6d
            goto Lae
        L6d:
            java.util.Iterator r9 = r9.iterator()
        L71:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r9.next()
            android.content.UriPermission r1 = (android.content.UriPermission) r1
            android.net.Uri r6 = r1.getUri()
            java.lang.String r6 = r6.toString()
            boolean r6 = defpackage.a34.i(r6, r11)
            if (r6 == 0) goto L71
            boolean r1 = r1.isWritePermission()
            if (r1 == 0) goto L71
            android.net.Uri r9 = android.net.Uri.parse(r11)
            r9.getClass()
            java.lang.String r9 = r9.toString()
            r9.getClass()
            java.lang.String r10 = r10.c
            r0.x = r7
            r0.A = r5
            zl1 r3 = (defpackage.zl1) r3
            java.lang.Object r9 = r3.c(r9, r10, r0)
            if (r9 != r8) goto Lbb
            goto Lba
        Lae:
            r0.x = r7
            r0.A = r4
            zl1 r3 = (defpackage.zl1) r3
            java.lang.Object r9 = r3.a(r0)
            if (r9 != r8) goto Lbb
        Lba:
            return r8
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m10.e(m00, xz0):java.lang.Object");
    }
}
