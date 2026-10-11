.class public final synthetic Landroidx/lifecycle/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/lifecycle/o0;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/o0;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/lifecycle/n0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/lifecycle/n0;->b:Landroidx/lifecycle/o0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/n0;->a:I

    iget-object v1, p0, Landroidx/lifecycle/n0;->b:Landroidx/lifecycle/o0;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {v1}, Landroidx/lifecycle/o0;->a(Landroidx/lifecycle/o0;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :goto_0
    invoke-static {v1}, Landroidx/lifecycle/o0;->a(Landroidx/lifecycle/o0;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
