package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fd implements kc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ fd(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.x;
        Object obj5 = this.y;
        switch (b) {
            case 0:
                gd gdVar = (gd) obj5;
                ll6 b2 = ((s82) gdVar.B).b((q82) obj, (s92) obj2, ((o92) obj3).a, ((p92) obj4).a);
                if (!(b2 instanceof kl6)) {
                    st3 st3Var = new st3(b2, gdVar.G);
                    gdVar.G = st3Var;
                    Object obj6 = st3Var.z;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                Object obj7 = ((kl6) b2).x;
                obj7.getClass();
                return (Typeface) obj7;
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((c36) obj5).I(new nb2(sQLiteQuery, (byte) 0));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
