// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InventoryService.proto

package ds.tutorial.inventory.grpc.generated;

public final class InventoryService {
  private InventoryService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_tutorial_inventory_grpc_generated_CheckInventoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_tutorial_inventory_grpc_generated_CheckInventoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_tutorial_inventory_grpc_generated_CheckInventoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_tutorial_inventory_grpc_generated_CheckInventoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026InventoryService.proto\022$ds.tutorial.in" +
      "ventory.grpc.generated\"*\n\025CheckInventory" +
      "Request\022\021\n\tproductId\030\001 \001(\t\"+\n\026CheckInven" +
      "toryResponse\022\021\n\tinventory\030\001 \001(\001\"P\n\023SetIn" +
      "ventoryRequest\022\021\n\tproductId\030\001 \001(\t\022\r\n\005val" +
      "ue\030\002 \001(\001\022\027\n\017isSentByPrimary\030\003 \001(\010\"&\n\024Set" +
      "InventoryResponse\022\016\n\006status\030\001 \001(\0102\245\001\n\025Ch" +
      "eckInventoryService\022\213\001\n\016checkInventory\022;" +
      ".ds.tutorial.inventory.grpc.generated.Ch" +
      "eckInventoryRequest\032<.ds.tutorial.invent" +
      "ory.grpc.generated.CheckInventoryRespons" +
      "e2\235\001\n\023SetInventoryService\022\205\001\n\014setInvento" +
      "ry\0229.ds.tutorial.inventory.grpc.generate" +
      "d.SetInventoryRequest\032:.ds.tutorial.inve" +
      "ntory.grpc.generated.SetInventoryRespons" +
      "eB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ds_tutorial_inventory_grpc_generated_CheckInventoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ds_tutorial_inventory_grpc_generated_CheckInventoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_tutorial_inventory_grpc_generated_CheckInventoryRequest_descriptor,
        new java.lang.String[] { "ProductId", });
    internal_static_ds_tutorial_inventory_grpc_generated_CheckInventoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ds_tutorial_inventory_grpc_generated_CheckInventoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_tutorial_inventory_grpc_generated_CheckInventoryResponse_descriptor,
        new java.lang.String[] { "Inventory", });
    internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryRequest_descriptor,
        new java.lang.String[] { "ProductId", "Value", "IsSentByPrimary", });
    internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_tutorial_inventory_grpc_generated_SetInventoryResponse_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
