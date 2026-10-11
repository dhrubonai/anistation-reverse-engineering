package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class z65 implements a75 {
    private final String identityHash;
    private final String legacyIdentityHash;
    private final int version;

    public z65(int i, String str, String str2) {
        this.version = i;
        this.identityHash = str;
        this.legacyIdentityHash = str2;
    }

    public void createAllTables(g85 g85Var) {
        g85Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void dropAllTables(g85 g85Var) {
        g85Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public final String getIdentityHash() {
        return this.identityHash;
    }

    public final String getLegacyIdentityHash() {
        return this.legacyIdentityHash;
    }

    public final int getVersion() {
        return this.version;
    }

    public void onCreate(g85 g85Var) {
        g85Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void onOpen(g85 g85Var) {
        g85Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void onPostMigrate(g85 g85Var) {
        g85Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void onPreMigrate(g85 g85Var) {
        g85Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public y65 onValidateSchema(g85 g85Var) {
        g85Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }
}
