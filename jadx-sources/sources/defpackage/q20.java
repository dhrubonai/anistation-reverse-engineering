package defpackage;

import com.anistation.repository.backup.BackupWorker;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q20 extends xz0 {
    public /* synthetic */ Object x;
    public final /* synthetic */ BackupWorker y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q20(BackupWorker backupWorker, xz0 xz0Var) {
        super(xz0Var);
        this.y = backupWorker;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.doWork(this);
    }
}
