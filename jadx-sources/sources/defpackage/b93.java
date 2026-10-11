package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b93 {
    public static final b93 x;
    public static final /* synthetic */ b93[] y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b93] */
    static {
        ?? r0 = new Enum("VIEWMODEL_SCOPE_FACTORY", 0);
        x = r0;
        y = new b93[]{r0};
    }

    public static b93 valueOf(String str) {
        return (b93) Enum.valueOf(b93.class, str);
    }

    public static b93[] values() {
        return (b93[]) y.clone();
    }
}
