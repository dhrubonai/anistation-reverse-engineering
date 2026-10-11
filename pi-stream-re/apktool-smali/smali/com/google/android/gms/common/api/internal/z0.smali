.class public final Lcom/google/android/gms/common/api/internal/z0;
.super Lcom/google/android/gms/common/api/internal/v0;
.source "SourceFile"


# instance fields
.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/internal/v0;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/z0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Lcom/google/android/gms/common/api/internal/z;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(Lcom/google/android/gms/common/api/internal/g0;)Z
    .locals 1

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/g0;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/z0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0}, La3/g;->z(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, La3/g;->z(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final g(Lcom/google/android/gms/common/api/internal/g0;)[Lb5/c;
    .locals 1

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/g0;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/z0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0}, La3/g;->z(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, La3/g;->z(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final h(Lcom/google/android/gms/common/api/internal/g0;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/g0;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/z0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0}, La3/g;->z(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, La3/g;->z(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/v0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 17
    .line 18
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method
