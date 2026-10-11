package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c54 {
    public static final /* synthetic */ c54[] A;
    public static final c54 x;
    public static final c54 y;
    public static final c54 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [c54, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c54, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [c54, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Default", 0);
        x = r0;
        ?? r1 = new Enum("UserInput", 1);
        y = r1;
        ?? r2 = new Enum("PreventUserInput", 2);
        z = r2;
        A = new c54[]{r0, r1, r2};
    }

    public static c54 valueOf(String str) {
        return (c54) Enum.valueOf(c54.class, str);
    }

    public static c54[] values() {
        return (c54[]) A.clone();
    }
}
