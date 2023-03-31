import java.util.BitSet;
import java.util.Objects;

public class CompressGene {
    private BitSet bitSet;
    private int length;

    public CompressGene(String gene) {
        compress(gene);
    }

    private void compress(String gene) {
        length = gene.length();
        bitSet = new BitSet(length*2);
        final String upperGene = gene.toUpperCase();
        for (int i = 0; i < length; i++) {
            final int firstLocation = 2 * i;
            final int secondLocation = 2 * i + 1;
            switch (upperGene.charAt(i)) {
                case 'A':
                    bitSet.set(firstLocation, false);
                    bitSet.set(secondLocation, false);
                    break;
                case 'C':
                    bitSet.set(firstLocation, false);
                    bitSet.set(secondLocation, true);
                    break;
                case 'G':
                    bitSet.set(firstLocation, true);
                    bitSet.set(secondLocation, false);
                    break;
                case 'T':
                    bitSet.set(firstLocation, true);
                    bitSet.set(secondLocation, true);
                    break;
                default:
                    throw new IllegalArgumentException("The provided gene contains characters other than ACGT");
            }
        }
    }

    public String decompress() {
        if (Objects.isNull(bitSet)) return "";

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length*2; i += 2) {
            final int firstBit = bitSet.get(i) ? 1 : 0;
            final int secondBit = bitSet.get(i + 1) ? 1 : 0;
            final int lastBits = firstBit << 1 | secondBit;
            switch (lastBits) {
                case 0b00:
                    sb.append('A');
                    break;
                case 0b01:
                    sb.append('C');
                    break;
                case 0b10:
                    sb.append('G');
                    break;
                case 0b11:
                    sb.append('T');
                    break;
            }
        }
        return sb.toString();
    }
}
