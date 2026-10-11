.class public final Lcom/google/android/gms/common/api/internal/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/gms/common/api/internal/q0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/q0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/gms/common/api/internal/q0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/q0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    check-cast v1, Lcom/google/android/gms/common/api/internal/g0;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/g0;->h()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_1
    check-cast v1, Lcom/google/android/gms/common/api/internal/r0;

    .line 16
    .line 17
    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/r0;->g:Lcom/google/android/gms/common/api/internal/i0;

    .line 18
    .line 19
    new-instance v1, Lb5/a;

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    invoke-direct {v1, v2}, Lb5/a;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/i0;->e(Lb5/a;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_0
    check-cast v1, Lcom/google/android/gms/common/api/internal/f0;

    .line 30
    .line 31
    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/f0;->a:Lcom/google/android/gms/common/api/internal/g0;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, " disconnecting because it was signed out."

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
