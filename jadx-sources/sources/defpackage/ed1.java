package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ed1 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ed1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return ((fd1) obj3).x.submit(new gb((Callable) obj2, (cn7) obj, (byte) 21));
            default:
                String str = (String) obj;
                WorkDatabase workDatabase = ((pu4) obj3).e;
                ((ArrayList) obj2).addAll(workDatabase.workTagDao().getTagsForWorkSpecId(str));
                return workDatabase.workSpecDao().getWorkSpec(str);
        }
    }
}
