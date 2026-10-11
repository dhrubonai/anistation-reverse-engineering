package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d54 {
    public static final d54 x;
    public static final /* synthetic */ d54[] y;

    /* JADX WARN: Type inference failed for: r0v0, types: [d54, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [d54, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [d54, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Default", 0);
        x = r0;
        y = new d54[]{r0, new Enum("UserInput", 1), new Enum("PreventUserInput", 2)};
    }

    public static d54 valueOf(String str) {
        return (d54) Enum.valueOf(d54.class, str);
    }

    public static d54[] values() {
        return (d54[]) y.clone();
    }
}
