.class public abstract Lcom/google/android/gms/common/api/a;
.super Lcom/google/android/gms/common/api/f;
.source "SourceFile"


# virtual methods
.method public buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/h;Ljava/lang/Object;Lcom/google/android/gms/common/api/internal/g;Lcom/google/android/gms/common/api/internal/p;)Lcom/google/android/gms/common/api/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Looper;",
            "Lcom/google/android/gms/common/internal/h;",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/common/api/internal/g;",
            "Lcom/google/android/gms/common/api/internal/p;",
            ")",
            "Lcom/google/android/gms/common/api/g;"
        }
    .end annotation

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "buildClient must be implemented"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/h;Ljava/lang/Object;Lcom/google/android/gms/common/api/m;Lcom/google/android/gms/common/api/n;)Lcom/google/android/gms/common/api/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Looper;",
            "Lcom/google/android/gms/common/internal/h;",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/common/api/m;",
            "Lcom/google/android/gms/common/api/n;",
            ")",
            "Lcom/google/android/gms/common/api/g;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual/range {p0 .. p6}, Lcom/google/android/gms/common/api/a;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/h;Ljava/lang/Object;Lcom/google/android/gms/common/api/internal/g;Lcom/google/android/gms/common/api/internal/p;)Lcom/google/android/gms/common/api/g;

    move-result-object p1

    return-object p1
.end method
