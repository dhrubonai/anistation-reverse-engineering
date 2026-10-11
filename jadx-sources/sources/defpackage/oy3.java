package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class oy3 {
    public final int endVersion;
    public final int startVersion;

    public oy3(int i, int i2) {
        this.startVersion = i;
        this.endVersion = i2;
    }

    public void migrate(g85 g85Var) {
        g85Var.getClass();
        if (g85Var instanceof w26) {
            migrate(((w26) g85Var).x);
            return;
        }
        throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }

    public void migrate(x26 x26Var) {
        x26Var.getClass();
        throw new Error("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
