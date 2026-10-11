package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tv3 implements dw3, j85 {
    public final /* synthetic */ long x;
    public final /* synthetic */ Object y;

    public /* synthetic */ tv3(long j, oy oyVar) {
        this.x = j;
        this.y = oyVar;
    }

    @Override // defpackage.j85
    public Object apply(Object obj) {
        oy oyVar = (oy) this.y;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.x));
        String str = oyVar.a;
        cu4 cu4Var = oyVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(du4.a(cu4Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(du4.a(cu4Var)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.dw3
    public Object j(bu3 bu3Var, dt3 dt3Var, int i) {
        try {
            return bu3Var.o(dt3Var, nw2.s(ar3.b(dt3Var.c, (Bundle) this.y)), 0, this.x);
        } catch (RuntimeException e) {
            kb0.P("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            return wc7.v(e);
        }
    }

    public /* synthetic */ tv3(Bundle bundle, long j) {
        this.y = bundle;
        this.x = j;
    }
}
