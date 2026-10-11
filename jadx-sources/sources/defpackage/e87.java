package defpackage;

import androidx.work.impl.model.WorkSpecDao_Impl;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class e87 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ WorkSpecDao_Impl y;
    public final /* synthetic */ z77 z;

    public /* synthetic */ e87(WorkSpecDao_Impl workSpecDao_Impl, z77 z77Var, byte b) {
        this.x = b;
        this.y = workSpecDao_Impl;
        this.z = z77Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        pn6 updateWorkSpec$lambda$0;
        pn6 insertWorkSpec$lambda$0;
        byte b = this.x;
        z77 z77Var = this.z;
        WorkSpecDao_Impl workSpecDao_Impl = this.y;
        g85 g85Var = (g85) obj;
        switch (b) {
            case 0:
                updateWorkSpec$lambda$0 = WorkSpecDao_Impl.updateWorkSpec$lambda$0(workSpecDao_Impl, z77Var, g85Var);
                return updateWorkSpec$lambda$0;
            default:
                insertWorkSpec$lambda$0 = WorkSpecDao_Impl.insertWorkSpec$lambda$0(workSpecDao_Impl, z77Var, g85Var);
                return insertWorkSpec$lambda$0;
        }
    }
}
