package uz.dilsh0d.interview.baytecode;

/**
 * Java Class File structure
 * A Java class file is consist of 10 basic sections:
 * 1. Magic Number: 0xCAFEBABE
 * 2. Version of Class File Format: the minor and major versions of the class file
 * 3. Constant Pool: Pool of constants for the class
 * 4. Access Flags: for example whether the class is abstract, static, etc.
 * 5. This Class: The name of the current class
 * 6. Super Class: The name of the super class
 * 7. Interfaces: Any interfaces in the class
 * 8. Fields: Any fields in the class
 * 9. Methods: Any methods in the class
 * 10. Attributes: Any attributes of the class (for example the name of the sourcefile, etc.)
 *
 * @author Tadjiev Dilshod
 */
public class ByteCodeStructure {
    /**
     * 1. Magic Number: 0xCAFEBABE
     *    u4 magic_number;
     *
     *    First 4 byte keep magic number of class file
     *
     * 2. Version of Class File Format: the minor and major versions of the class file
     *    u2 minor_version;
     *    u2 major_version;
     *
     *    Next 4 byte keep minor and major version number
     *
     *    Exceptions If the number is greater than what JVM can load : java.lang.UnsupportedClassVersionError
     *
     * 3.Constant Pool: Pool of constants for the class
     *    u2 constant_pool_count;
     *    cp_info constant_pool[constant_pool_count - 1];
     *
     *
     * 4.Access Flags: for example whether the class is abstract, static, etc.
     *    u2 access_flags;
     *
     *    Next 2 byte keep
     *
     * 5. This Class: The name of the current class
     *    u2 this_class;
     *
     *    Next 2 byte keep
     *
     * 6. Super Class: The name of the super class
     *    u2 super_class;
     *
     *    Next 2 byte keep
     *
     * 7. Interfaces: Any interfaces in the class
     *    u2 interfaces_count;
     *    interfaces[interfaces_count];
     *
     *    Next 2 byte keep
     *
     * 8. Fields: Any fields in the class
     *    u2 fields_count;
     *    field_info fields[fields_count];
     *
     *   Next 2 byte keep
     *
     * 9.Methods: Any methods in the class
     *    u2 methods_count;
     *    method_info methods[methods_count];
     *
     *   Next 2 byte keep
     *
     * 10. Attributes: Any attributes of the class (for example the name of the sourcefile, etc.)
     *    u2 attributes_count;
     *    attribute_info attributes[attributes_count];
     *
     *    Next 2 byte keep
     */
}
